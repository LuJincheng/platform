package com.cn.platform.core.base.constroller;

import org.apache.log4j.Logger;

import platform.test.constroller.TestDemoConstroller;


/** 
* @packageName: com.cn.platform.core.base.constroller
* @ClassName: BaseConstroller 
* @Description: 【用于处理业务的baseConstroller,在此Constroller里
* 		做公共的业务处理】
* @author lujc
* @date 2015年7月27日 下午2:28:59 
*  
*/ 
public class BaseConstroller {
	private static final Logger logger = Logger.getLogger(TestDemoConstroller.class);
	public BaseConstroller(){
		logger.debug("基类 BaseConstroller 加载...");
	}
	
}
