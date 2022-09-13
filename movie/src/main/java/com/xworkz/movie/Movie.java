package com.xworkz.movie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Value("${movieName}")
	String name;
	@Value("${movieHeroName}")
	String heroName;	
	@Value("${moviePrice}")
	Double ticketPrice;

	public Movie() {
       System.out.println(this.getClass().getSimpleName());
	}

	public Movie(String name, String heroName, Double ticketPrice) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.ticketPrice=ticketPrice;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", heroName=" + heroName + ", ticketPrice=" + ticketPrice + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public void setPrice(double ticketPrice) {
		this.ticketPrice=ticketPrice;
	}
	
	
}
