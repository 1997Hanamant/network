package com.xworkz.movie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages="com.xworkz.movie")
public class BeanConfig {
	
     @Bean
	public PropertySourcesPlaceholderConfigurer createBean() {
		System.out.println("Invoked Bean");
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		ClassPathResource classPathResource = new ClassPathResource("movie.properties");
		propertySourcesPlaceholderConfigurer.setLocation(classPathResource);
		return propertySourcesPlaceholderConfigurer;
		
	}
}
