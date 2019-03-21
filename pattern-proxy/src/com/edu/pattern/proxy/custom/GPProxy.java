package com.edu.pattern.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;

public class GPProxy {

    public static final String ln = "\r\n";
    public static Object newProxyInstance(GPClassLoader classLoader,Class<?>[] interfaces,GPInvocationHandler h){

        try {
            //1.动态生成源代码.Java文件

            String src = generateSrc(interfaces);

            //2、.Java文件输出磁盘
            //Class.getResource：不以’/'开头时，默认是从此类所在的包下取资源；以’/'开头时，则是从ClassPath根下获取；
            String filePath = GPProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            //3、把生成的.Java文件编译成.class文件
            //JavaCompiler：Java编译程序  JDK提供了标准的包可以方便的调用JVM的编译器，可以方便的使用JVM的编译器来编译java源文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            //StandardJavaFileManager 标准Java文件管理器
            //diagnotic  诊断的  listener 监听   locale :场所或地点  charset ；字符类型
            StandardJavaFileManager manger = compiler.getStandardFileManager(null,null,null);

            Iterable iterable = manger.getJavaFileObjects(f);
            //CompilationTask :汇编任务
            //options 选项
            JavaCompiler.CompilationTask task = compiler.getTask(null,manger,null,null,null,iterable);
            task.call();
            manger.close();

            //4、编译生成.class文件加载到JVM
            Class proxyClass = classLoader.findClass("$Proxy0");
            //getConstructor()或getDeclaredConstructor() 方法获得构造器
            //getConstructor获取有参数构造函数 然后newInstance执行有参数的构造函数
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            //文件删除
            f.delete();
            //5、返回字节码重组以后的新的代理对象
            return c.newInstance(h);
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {

        StringBuffer sb = new StringBuffer();
        sb.append("package com.edu.pattern.proxy.custom;"+ln);
        sb.append("import com.edu.pattern.proxy.staticed.Person;"+ln);
        sb.append("import java.lang.reflect.Method;"+ln);
        sb.append("public class $Proxy0 implements "+interfaces[0].getName()+"{"+ln);

            sb.append("GPInvocationHandler h;"+ ln);

            sb.append("public $Proxy0(GPInvocationHandler h) {" + ln);

                sb.append("this.h=h;");

            sb.append("}"+ln);

            for(Method m: interfaces[0].getMethods()){
                sb.append("public "+m.getReturnType().getName()+" "+m.getName()+"() {"+ln);
                    sb.append("try{"+ln);
                        sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\""+m.getName()+"\",new Class[]{});"+ln);
                        sb.append("this.h.invoke(this,m,null);" + ln);
                    sb.append("}catch(Throwable e){" + ln);
                    sb.append("e.printStackTrace();" + ln);
                    sb.append("}");
                sb.append("}");
            }

        sb.append("}" + ln);

        return sb.toString();
    }

}
