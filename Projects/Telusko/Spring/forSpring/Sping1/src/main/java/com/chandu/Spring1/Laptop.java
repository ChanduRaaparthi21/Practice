package com.chandu.Spring1;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

	public Laptop() {
		System.out.println("Laptop object is created");
	}
	
	
	@Override
	public void compileDesk() {
		System.out.println("compile from Laptop");
	}
	
}
