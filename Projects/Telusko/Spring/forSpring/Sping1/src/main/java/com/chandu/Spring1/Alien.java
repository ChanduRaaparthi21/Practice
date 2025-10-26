package com.chandu.Spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Value("34")
	private int age;
	@Autowired
//	@Qualifier("desktop")
	
	private Computer lap;

	
	public Alien() {
		System.out.println("Alien object is created");
	}
	
	//constructor-injection
//	public Alien(int age) {
//		this.age=age;
//	}
//	
	
	
	public Alien(int age, Computer lap) {
		super();
		this.age = age;
		this.lap = lap;
	}
	
	
	
	public int getAge() {
		return age;
	}


	

	

	public void setAge(int age) {
//		System.out.println("Setter called");
		this.age = age;
	}
	
	




	public Computer getLap() {
		return lap;
	}



@Autowired
@Qualifier("laptop")
	public void setLap(Computer lap) {
		this.lap = lap;
	}




	public void code() {
		System.out.println("coding");
		lap.compileDesk();
	}

}
