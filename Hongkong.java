package com.spring.spring1;

public class Hongkong implements Tour {
	public Hongkong() {
		System.out.println("hongkong class object created");
	}
	
	@Override
	public void fare() {
		System.out.println("3000");
	}
	@Override
	public void distance() {
		System.out.println("2300 miles");
	}

}
