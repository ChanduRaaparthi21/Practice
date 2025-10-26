package com.chandu.app.Repository;

import org.springframework.stereotype.Repository;

import com.chandu.app.Model.Laptop;

@Repository
public class LaptopRepository {
	
	public void save(Laptop laptop) {
		System.out.println("saved in db");
	}

}
