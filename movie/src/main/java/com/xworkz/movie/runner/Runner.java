package com.xworkz.movie.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.movie.Movie;
import com.xworkz.movie.config.BeanConfig;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println(context);
		Movie bean = context.getBean(Movie.class);
		System.out.println(bean);
	}

}
