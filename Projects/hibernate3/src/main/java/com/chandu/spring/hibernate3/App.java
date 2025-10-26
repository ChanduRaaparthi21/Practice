package com.chandu.spring.hibernate3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chandu.spring.hibernate3.Business.ProductsBusiness;
import com.chandu.spring.hibernate3.Business.ProductsBusinessImpl;
import com.chandu.spring.hibernate3.entities.Products;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");
    	
    	ProductsBusiness productsBusiness =(ProductsBusinessImpl)context.getBean("productsBusinessImpl");
    	
    	Products products = new Products();
    	
    	products.setName("samsung");
    	products.setProductid("samsungtv344");
    	products.setCategory("tv");
    	products.setQuantity(50);
    	
    	productsBusiness.save(products);
    	
        
    }
}
