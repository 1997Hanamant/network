package com.xworkz.mobile;

import org.springframework.stereotype.Component;

@Component
public class Mobile {
	private String barnd;
	private String color;
	private double price;
	
	public Mobile() {
		System.out.println(this.getClass().getSimpleName()+"bean created");
	}

}

