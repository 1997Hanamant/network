package com.xworkz.bar.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.bar.Bar;

public class BarRunner {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("configrue.xml");
		System.out.println(Context);
		Bar bean = Context.getBean(Bar.class);
		System.out.println(bean);
	}

}
