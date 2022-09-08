package com.xworkz.mobile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileRunner {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("configurecontext.xml");
		System.out.println(container);
		Mobile bean = container.getBean(Mobile.class);
		System.out.println(bean);

	}

}
