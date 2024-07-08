package com.spring.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("spring configuration loaded-context created");
		Tour tour=context.getBean("tour",Tour.class);
		tour.fare();
		tour.distance();
		
		Tour tour1=context.getBean("tour",Tour.class);
		tour1.fare();
		tour1.distance();
		
		
		
	}
	

}
