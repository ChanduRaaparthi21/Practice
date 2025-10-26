package com.chandu.Spring1.AppConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.chandu.Spring1.Alien;
import com.chandu.Spring1.Computer;
import com.chandu.Spring1.Desktop;
import com.chandu.Spring1.Laptop;

@Configuration
@ComponentScan("com.chandu")
public class AppConfig {

	
	
	/*
	 * 
	 * // @Bean(name = {"desk1","desk2","desk3"})
	 * 
	 * @Bean // @Scope("prototype") public Desktop desktop() { Desktop d = new
	 * Desktop(); d.compileDesk(); return d; }
	 * 
	 * 
	 * @Bean public Alien alien( Computer com) { //@Qualifier("desktop")
	 * 
	 * Alien obj = new Alien(); obj.setAge(37); obj.setLap(com);
	 * 
	 * return obj; }
	 * 
	 * 
	 * @Bean
	 * 
	 * @Primary public Laptop laptop() { return new Laptop(); }
	 */

}
