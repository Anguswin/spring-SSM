package com.huayun.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huayun.model.App;
/**
 * 测试spring
 *
 */
public class TestSpring {

	@Test
	public void testSpring() {
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		App app = (App) ac.getBean("app");
		System.out.println(app);
	}
}
