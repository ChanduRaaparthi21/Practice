package com.chandu.Spring1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

	@Override
	public void compileDesk() {
		System.out.println("Desktop object is created");

	}

	

}
