package com.chandu.setterinjection.myfirstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //creating Spring Container
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/chandu/setterinjection/myfirstproject/configmetadata.xml");
    	
    	//get customer object
    	
        Customer customer =(Customer) context.getBean("customer");
        
        
        System.out.println("customer details :"+customer.toString());
        
        //check order details
        Order order =(Order) context.getBean("order");
        System.out.println("order details :"+order.toString());
    	
 
    	
    	
    }
}
