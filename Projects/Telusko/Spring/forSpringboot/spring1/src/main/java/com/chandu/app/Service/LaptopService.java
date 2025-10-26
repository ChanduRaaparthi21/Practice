package com.chandu.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.app.Model.Laptop;
import com.chandu.app.Repository.LaptopRepository;

@Service
public class LaptopService {

	
	@Autowired
	private LaptopRepository laptopRepository;
	
	
	public void addLaptop(Laptop laptop) {
		System.out.println("addLaptop is called");
		 laptopRepository.save(laptop);
		
	}
	
	public boolean isGoodForProg(Laptop laptop) {
		return true;
	}
	
	
	
	
}
