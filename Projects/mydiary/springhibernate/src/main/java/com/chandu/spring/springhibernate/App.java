package com.chandu.spring.springhibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.chandu.spring.springhibernate.business.EmployeeBusiness;
import com.chandu.spring.springhibernate.business.EmployeeBusinessImpl;
import com.chandu.spring.springhibernate.entities.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    EmployeeBusiness employeeBusiness = (EmployeeBusinessImpl)context.getBean("employeeBusinessImpl");
    
    
    /*
    Employee employee = new Employee();
  
  
    employee.setAddress("hyd");
    employee.setContact("7777777");
    employee.setEname("pawan");
    employee.setExp(13);
    employee.setId(3);
    
    employeeBusiness.save(employee); */ //idhi table loki data enter chesi save cheyyadaniki
    
    
    
    
    // idhi table lo already unna name ni update cheyyadam
    
   //   Employee employee = employeeBusiness.findById(2);
    
   //   employee.setEname("siva");
   //   employeeBusiness.update(employee);
    
    
    
    //idhi table lo oka emplyee ni delete cheyyadaniki
//    Employee employee = employeeBusiness.findById(2);
 //        employeeBusiness.delete(employee);
     
    
    
   List<Employee> employees =   employeeBusiness.findAll();
   for(Employee e : employees)
   {
	   System.out.print("id :"+e.getId());
	   System.out.println("  - name :"+e.getEname());
   }
        
    }
}
