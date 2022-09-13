package com.xworkz.laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	//@Value("HP")
	private String name;
	//@Value("Black")
	private String color;
	//@Value("300000D")
	private double price;
	//@Autowired
	private Bag bag;

	public Laptop() {
		System.out.println(this.getClass().getSimpleName()+"bean created");	
	}
      public Laptop(@Value("HP") String name, @Value("Black")String color, @Value("2000D")double price ,@Autowired Bag bag) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.bag=bag;
	}
	public String getName() {
		return name;
	}
      // @Value("HP")
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}
      // @Value("Black")
	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}
   //   @Value("30000D")
	public void setPrice(double price) {
		this.price = price;	
		
		}
        @Autowired
      public void setBag(Bag bag) {
    	  this.bag=bag;
      }
      public Bag getBag() {
    	  return bag;
      }
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", color=" + color + ", price=" + price + ", bag=" + bag + "]";
	}	
}
