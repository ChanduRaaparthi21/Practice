package com.chandu.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chandu.spring.springjdbc.business.EmployeeBusiness;
import com.chandu.spring.springjdbc.business.EmployeeBusinessImpl;
import com.chandu.spring.springjdbc.dto.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	EmployeeBusiness employeeBusiness = (EmployeeBusinessImpl)context.getBean("employeeBusiness");
    	
    	
    	
//    	Employee emp = new Employee("13","subbarao",17);
 //   	employeeBusiness.insertEmployee(emp);
    	
    	
    	employeeBusiness.printEmployeeHikes();
    	
    }
}
