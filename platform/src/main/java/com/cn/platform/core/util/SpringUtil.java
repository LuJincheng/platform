package com.cn.platform.core.util;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/** 
* @packageName: com.cn.platform.core.util
* @ClassName: SpringUtil 
* @Description: 【spring 配置上下文，获取 applicationContent的相应信息，
* 					以及获取spring工厂中响应的bean
* 				】
* @author lujc
* @date 2015年7月28日 上午9:54:19 
*/ 
public class SpringUtil {
	/** 
	* @fieldType: ApplicationContext
	* @Fields: content 
	* @Description: spring 上下文文件
	*/ 
	private static final Logger logger = Logger.getLogger(SpringUtil.class);
	private static ApplicationContext content = null;
	static {
		if(content==null){
			content = new ClassPathXmlApplicationContext("applicationContext.xml");
		}
		if(content!=null){
			logger.debug("spring上下文文件加加载成功...");
		}else{
			logger.debug("spring上下文文件加加载失败...");
		}
	}
	public static ApplicationContext getApplicationContext(){
		
		return content;
	}
	
	/**	 
	* @Title: getBean  
	* @Description: 【从spring 上下文中获取bean 对象】 
	* @param @param classes 对象类型
	* @param @return    
	* @return T 返回bean中的实体
	*/ 
	public static <T> T getBeanByType(Class<T> classes){
		T enty = null ;
		try{
			enty = content.getBean(classes);	
		}catch(Exception e){
			e.printStackTrace();
		}
		return enty; 
	}
}
