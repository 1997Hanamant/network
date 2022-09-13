package com.xworkz.resort;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Resort {

	@Value("${resortName}")
	String name;
	@Value("${resortPrice}")
	double price;
    @Value("${resortOwner}")
	String owner;

	public Resort() {
		System.out.println(this.getClass().getSimpleName());
	}

	public Resort( String name,  double price,
			 String owner) {
		super();
		this.name = name;
		this.price = price;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Resort [name=" + name + ", price=" + price + ", owner=" + owner + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
