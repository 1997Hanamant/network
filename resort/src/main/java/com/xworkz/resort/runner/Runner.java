package com.xworkz.resort.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.resort.Resort;

public class Runner {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("configure.xml");
		System.out.println(Context);
		Resort bean = Context.getBean(Resort.class);
		System.out.println(bean);
	ClassPathXmlApplicationContext applicationContext	=(ClassPathXmlApplicationContext) Context;
	applicationContext.close();
		
	
	}
}
