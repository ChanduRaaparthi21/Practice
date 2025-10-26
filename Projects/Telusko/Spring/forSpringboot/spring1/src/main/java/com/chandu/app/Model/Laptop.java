package com.chandu.app.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
	
//	@Autowired
//	Cpu cpu;

	public void compile() {
		System.out.println("Compiling... from laptop");
	}
	
}
