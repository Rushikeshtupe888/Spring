package com.spring.spring1;

public class Argentina implements Tour {
	
	@Override
	public void fare() {
		System.out.println("8000");
	}
	@Override
	public void distance() {
		System.out.println("15000 kms");
	}

}
