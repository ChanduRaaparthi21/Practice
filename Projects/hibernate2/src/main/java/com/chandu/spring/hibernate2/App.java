package com.chandu.spring.hibernate2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chandu.spring.hibernate2.business.StudentBusiness;
import com.chandu.spring.hibernate2.business.StudentBusinessImpl;
import com.chandu.spring.hibernate2.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    StudentBusiness studentBusiness	= (StudentBusinessImpl) context.getBean("studentBusinessImpl");
    
    //  Student student = new Student();
      
    //  student.setRollno(3);
     // student.setSname("pawan");
     // student.setSmarks("100");
     // studentBusiness.save(student);
      
      // Student student = studentBusiness.findById(2);
      // student.setSname("siva");
      // studentBusiness.update(student);
    
   // Student student = studentBusiness.findById(2);
    // studentBusiness.delete(student);
    
      
    }
}
