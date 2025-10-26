package com.chandu.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public ModelAndView homepagemethod()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		
		return mv;
	}

}
