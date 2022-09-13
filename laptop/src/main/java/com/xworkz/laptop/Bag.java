package com.xworkz.laptop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Bag {
	//@Value("Accenture")
	private String name;
	//@Value("Balck")
	private String color;
	//@Value("1000D")
	private double price;
	
	public Bag() {
		System.out.println(this.getClass().getSimpleName()+"Bean is created");
	}

	public Bag(@Value("Accenture") String name,@Value("Balck") String color, @Value("1000D")double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bag [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}
