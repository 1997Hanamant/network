package com.xworkz.resort.resort.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.resort.ConnectionConfig;

public class ConfigRunner {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configure.xml");
		System.out.println(context);
		ConnectionConfig bean = context.getBean(ConnectionConfig.class);
		System.out.println(bean);

	}

}
