package platform.test.constroller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.platform.core.base.constroller.BaseConstroller;


/**
 * 
 * 测试spring mvc 框架
 * @author lujc 
 *
 */
@Controller
@RequestMapping("/testDemoConstroller")
public class TestDemoConstroller extends BaseConstroller{
	private static final Logger logger = Logger.getLogger(TestDemoConstroller.class);
	@RequestMapping(params = "toIndex")
	public ModelAndView toIndex(){
		logger.info("进入测试页面..");
		return new ModelAndView("index");
	}
}
