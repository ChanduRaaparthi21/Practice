package com.chandu.spring.mysecondproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/chandu/spring/mysecondproject/config.xml");
    	
    /*	 Customer customer = (Customer) context.getBean("cust");
    	 
    	 System.out.println("name :"+customer.getName());
    	 System.out.println("contact :"+customer.getContact());
    	 System.out.println("address :"+customer.getAddress()); */
    	
    	
    	
    	Order order = (Order) context.getBean("ordr");
    	
    	System.out.println("product id :"+order.getProductid());
    	System.out.println("product name :"+order.getProductname());
    	System.out.println("customer name :"+order.getCustomer().getName());

    	 
    	
    	
    	
    }
}
