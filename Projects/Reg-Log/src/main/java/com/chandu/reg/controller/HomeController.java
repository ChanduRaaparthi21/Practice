package com.chandu.reg.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chandu.reg.Business.UserBusinessInterface;
import com.chandu.reg.Entities.User;

@Controller
public class HomeController {
	
	
  
	@Autowired
	private UserBusinessInterface businessInterface;
	
	@Autowired
	private HttpSession httpSession;
	
	
	@RequestMapping("regpage")
	public ModelAndView regform() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("reg");
		
		
		return model;
	}
	
	@RequestMapping("register")
	public ModelAndView registrationpage()
	{
		ModelAndView model = new ModelAndView("reg");
		
		return model;
	}
	
	
	@RequestMapping(value = "saveuser", method = RequestMethod.POST)
	public ModelAndView saveuser(@ModelAttribute("user") User user) {
		
		ModelAndView model = new ModelAndView();
		
		
		model.setViewName("regsuccess");
		
		businessInterface.save(user);
		
		return model;
	}
	
	@RequestMapping("log")
	public ModelAndView loginpage()
	{
		ModelAndView model = new ModelAndView("log");
		
		return model;
	}
	
	@RequestMapping(value="login" , method = RequestMethod.POST)
	public ModelAndView authenticateuser(@ModelAttribute("user") User user )
	{
		
		ModelAndView model = new ModelAndView("userhome");
		
		User user1 = businessInterface.findByUsername(user.getUsername());
		
		if(user1!=null && user.getPassword().equals(user1.getPassword())) {
			
			model.setViewName("userhome");
			model.addObject("user", user1);
			httpSession.setAttribute("user", user1);
		
		  
		}
		
		return model;
		
	}


}
