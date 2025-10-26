package com.chandu.Spring1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chandu.Spring1.AppConfig.AppConfig;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	//Java based config
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		/*
		 * Desktop dc = context.getBean("desktop",Desktop.class); dc.compile();
		 * 
		 * Desktop dc1 = context.getBean("desktop",Desktop.class); dc1.compile();
		 */
    	
    	 Alien obj = (Alien)context.getBean(Alien.class); 
//    	 obj.setAge(33);
		  System.out.println(obj.getAge()); 
		  obj.code();
		  
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml");
		 * 
		 * Alien obj = (Alien)context.getBean("alien"); // obj.setAge(0);
		 * System.out.println(obj.getAge()); obj.code();
		 */
    	
    	
    }
}
