package com.chandu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chandu.Model.Alien;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		System.out.println("home method is called");
		
		return "index";
	}
	
	
	/*
	 * //doing in normal way(using servlets)
	 * 
	 * @GetMapping("add") public String add(HttpServletRequest req, HttpSession
	 * session) { System.out.println("in add"); int num1 =
	 * Integer.parseInt(req.getParameter("num1")); int num2 =
	 * Integer.parseInt(req.getParameter("num2")); int result = num1+num2;
	 * session.setAttribute("result", result); // System.out.println(result);
	 * 
	 * return "result.jsp"; }
	 */
	
	//or this code
	
	/*
	 * @GetMapping("add") public String add(@RequestParam("num1") int
	 * num1, @RequestParam("num2") int num2, Model model) {
	 * 
	 * int result = num1+num2; model.addAttribute("result",result); //
	 * System.out.println(result);
	 * 
	 * return "result"; }
	 */
	
	//or this code
	
	@GetMapping("add") 
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {
			  
			  int result = num1+num2; 
			 mv.addObject("result",result);
			 mv.setViewName("result");
//			  System.out.println(result);
			  return mv; 
			  }
	
	
	//for adding alien
	
	
	@GetMapping("/addAlien")
	public String alien() {
		System.out.println("alien method is called");
		
		return "alien";
	}
	
	
	/*
	 * @GetMapping("addAliens") public ModelAndView addAlien(@RequestParam("aid")
	 * int aid, @RequestParam("aname") String aname, ModelAndView mv) {
	 * 
	 * Alien alien = new Alien(); alien.setAid(aid); alien.setAname(aname);
	 * 
	 * mv.addObject("alien",alien); mv.setViewName("alienResult");
	 * 
	 * return mv; }
	 */
	
	//or this code
	
	@GetMapping("addAliens") 
	public String addAlien(Alien alien)  //@ModelAttribute--optional
	{

			  return "alienResult"; 
			  }
	
	@ModelAttribute("course")
	public String Course() {
		return "pyhton";
	}
	
	@GetMapping("/Hi") 
	public String hi() 
	{
		System.out.println("alien method is called");

			  return "HI"; 
			  }
	
	
}
