package com.chandu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.chandu.app.Model.Alien;
import com.chandu.app.Model.Laptop;
import com.chandu.app.Service.LaptopService;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Spring1Application.class, args);
		
		
		LaptopService laptopService = context.getBean(LaptopService.class);
		
		Laptop laptop = context.getBean(Laptop.class);
		laptopService.addLaptop(laptop);
		
		
		/*
		 * Alien obj = context.getBean(Alien.class); System.out.println(obj.getAge());
		 * obj.code();
		 */
//		
//		Alien obj1 = context.getBean(Alien.class);
//		obj1.code();
		
		
	}

}
