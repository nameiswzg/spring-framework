package com.wzg.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @DESCRIPTION: new Class
 * @AUTHOR wangzengguang
 * @DATE 2021/2/23 8:08 下午
 **/
public class MyTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		MyBeans myBeans = (MyBeans) context.getBean("myBeans");
		myBeans.setName("wangzengguang");
		System.out.println(myBeans);
	}
}
