package com.edu.pattern.delegate.mvc;

import com.edu.pattern.delegate.mvc.controllers.MethodAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 相当于项目经理的角色
 */
public class ServletDispatcher {

    private List<Handler> handlerMapping = new ArrayList<Handler>();

    public ServletDispatcher(){
        Class<?> methodActionClass = MethodAction.class;
        try {
            handlerMapping.add(new Handler()
                    .setController(methodActionClass.newInstance())
                    .setMethod(methodActionClass.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void doService(HttpServletRequest request,HttpServletResponse response){
        doDispatch(request,response);
    }

    public void doDispatch(HttpServletRequest request,HttpServletResponse response){
        //1、获取用户请求的url
        //  如果按照J2EE的标准，每个url都对应着一个Servlet，url由浏览器输入
        String  uri = request.getRequestURI();

        //2、Servlet 拿到url后，要做权衡（判断，选择）
        //  根据用户请求的url 去找url 对应的某一个java类的方法

        //3、通过拿到的url 去handlerMapper (一般认为是策略常量)
        Handler handler = null;
        for (Handler h: handlerMapping ) {
            if(h.getUrl().equals(uri)){
                handler = h;
                break;
            }
        }
        //4、将具体的任务分发给Method(通过反射去调用其对应的方法)
        Object object = null;
        try {
            //参数
            object = handler.getMethod().invoke(handler.getController(),request.getParameter("mid"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //5、获取到Method 执行的结果，通过Response返回出去
//        response.getWriter().write();

    }

    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }

}
