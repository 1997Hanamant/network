package com.xworkz.laptop.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container= new ClassPathXmlApplicationContext("configure.xml");
		System.out.println(container);
		Laptop bean = container.getBean(Laptop.class);
		System.out.println(bean);

	}

}
