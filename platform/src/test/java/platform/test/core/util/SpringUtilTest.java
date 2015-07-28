package platform.test.core.util;

import org.junit.Test;

import com.cn.platform.core.util.SpringUtil;

import platform.test.constroller.TestDemoConstroller;

/** 
* @packageName: platform.test.core.util
* @ClassName: SpringUtilTest 
* @Description: 【用于测试com.cn.platform.core.util.SpringUtil
* 				  的相关方法。
* 				】
* @author lujc
* @date 2015年7月28日 上午10:29:59 
*  
*/ 
public class SpringUtilTest {
	/** 
	* @Title: testGetBeanByType 
	* @Description: 测试 getBeanByType方法   
	* @return void 
	* @throws 
	*/ 
	@Test
	public void testGetBeanByType(){
		TestDemoConstroller demo = SpringUtil.getBeanByType(TestDemoConstroller.class);
		System.out.println(demo);
	}
}
