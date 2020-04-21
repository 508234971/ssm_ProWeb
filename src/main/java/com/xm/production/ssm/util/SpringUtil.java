package com.xm.production.ssm.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * 加载spring容器
 *
 * @author  xm
 * @version  0.0.1
 */
public class SpringUtil {
	public static ApplicationContext context;
	static{
		context = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
	}
}
