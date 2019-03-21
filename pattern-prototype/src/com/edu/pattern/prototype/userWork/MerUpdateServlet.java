package com.edu.pattern.prototype.userWork;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 商户认证
 * 将获取到的相应资料上传给上游
 * @author sk
 *
 */
@WebServlet("/merupdate")
public class MerUpdateServlet extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		Map<String,String> requestMap = getParamValues(request, MerUpdateServlet.class);
		AppMerInfo info = null;
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(AppMerInfo.class); // 获取类属性    
			info = AppMerInfo.class.newInstance(); // 创建 JavaBean 对象    
	    
	        // 给 JavaBean 对象的属性赋值    
	        PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();    
	        for (int i = 0; i< propertyDescriptors.length; i++) {    
	            PropertyDescriptor descriptor = propertyDescriptors[i];    
	            String propertyName = descriptor.getName();    
	    
	            if (requestMap.containsKey(propertyName)) {    
	                // 下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。    
	                Object value = requestMap.get(propertyName);    
	    
	                Object[] args = new Object[1];    
	                args[0] = value; 
	                descriptor.getWriteMethod().invoke(info, args);    
	            }    
	        }
			System.out.println(info);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return;
	}


	/**
	 * request参数处理,返回Map<参数名,参数值>
	 * @param request
	 * @return
	 */
	public static Map<String,String> getParamValues(HttpServletRequest request, Class o){
		System.out.println("================"+request.getHeader("USER-AGENT").toLowerCase()+"================");

		Map map = request.getParameterMap();
		Set keSet = map.entrySet();
		Map<String,String> mapParam = new HashMap<String,String>();
		for (Iterator itr = keSet.iterator(); itr.hasNext();) {
			Map.Entry me = (Map.Entry) itr.next();
			Object ok = me.getKey();
			Object ov = me.getValue();
			String[] value = new String[1];
			if (ov instanceof String[]) {
				value = (String[]) ov;
			} else {
				value[0] = ov.toString();
			}
			for (int k = 0; k < value.length; k++) {
				mapParam.put(ok+"", value[k]);
			}
		}
		return mapParam;
	}
}
