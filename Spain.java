package com.spring.spring1;

public class Spain implements Tour {
	public Spain() {
		System.out.println("Spain class object created");
	}
	
	@Override
	public void fare() {
		System.out.println("45000");
	}
	@Override
	public void distance() {
		System.out.println("6000 miles");
	}

}
