package com.chandu.forHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import Hibernate_Relation_OR_Mapping_Relational.Laptop;
import Hibernate_Relation_OR_Mapping_Relational.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	//Alien chandu = new Alien();
    	
//    	chandu.setAid(102);
//    	chandu.setAname("raparthi");
//    	chandu.setAcolor("red");
    	
    Laptop lap= new Laptop();
    lap.setLid(101);
    lap.setLname("Lenovo");
    
    
    Student student = new Student();
    student.setRollno(1);
    student.setSname("Chandu");
    student.setMarks(76);
//    student.setLaptop(lap);//oneToOne
    student.getLaptop().add(lap); //onetomany
    	
    lap.getStudent().add(student); //manytomany
    	
    	Configuration configuration = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
    	SessionFactory factory = configuration.buildSessionFactory();
    	Session session = factory.openSession();
    	session.beginTransaction();
    			session.save(lap);
    			session.save(student);
    			
    			//chandu = (Alien)session.get(Alien.class, 101);//for getting data from db using hibernate 
    			
    			session.getTransaction().commit();
    			
//    			System.out.println(student);
    	
    }
}
