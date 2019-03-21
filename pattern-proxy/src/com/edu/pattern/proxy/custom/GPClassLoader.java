package com.edu.pattern.proxy.custom;

import java.io.*;

public class GPClassLoader extends ClassLoader{

    private File classPathfile;
    public GPClassLoader(){
        //getResource :当前类(class)所在的包目录
        String  classPath = GPClassLoader.class.getResource("").getPath();
        this.classPathfile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //getPackage 返回已知调用方的ClassLoader实例程序包的新数组
        String className = GPClassLoader.class.getPackage().getName() + "." + name;
        if(classPathfile !=null){
            File classFile =  new File(classPathfile,name.replaceAll("\\.","/")+".class");
            if(classFile.exists()){
                FileInputStream fis = null;
                ByteArrayOutputStream baos=null;
                try{
                    fis= new FileInputStream(classFile);
                    baos  = new ByteArrayOutputStream();
                    //创建字节
                    byte[] buff = new byte[1024];
                    int len;
                    //把class文件转换成byte字节
                    while((len = fis.read(buff))!=-1){
                        //写入字节
                        baos.write(buff,0,len);
                    }
                    //loadClass（String name）；根据cn.com.akl.DemoController查找并加载类。先在parent或bootstrap中查找，有则给jvm加载。没有则按照findClass方法查找。
                    //
                    //findClass（）；默认抛出一个ClassNotFoundException，如果需要自己重新覆盖实现。
                    //
                    //defineClass（）；是将你定义的字节码文件经过字节数组流解密之后，将该字节流数组生成字节码文件，也就是该类的文件的类名.class。通常用在重写findClass中，返回一个Class。如果不想要把class加载到jvm中，也可以单独使用getConstructor和newInstance来实例化一个对象。

                    return defineClass(className,baos.toByteArray(),0,baos.size());
                }catch(Exception e){
                    e.printStackTrace();
                }finally {
                    //最后关闭连接
                    if(null != fis){
                        try{
                            fis.close();
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }

                    if(baos != null){
                        try{
                            baos.close();
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }
}
