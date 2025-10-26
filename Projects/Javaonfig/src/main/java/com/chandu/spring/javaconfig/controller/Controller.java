package com.chandu.spring.javaconfig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

	
	@RequestMapping("home")
	public ModelAndView homepage ()
	{
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("home");
		
		return mv;
		
	}
	
	

	
	
	
}
