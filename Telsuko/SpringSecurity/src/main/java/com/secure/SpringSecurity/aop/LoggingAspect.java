package com.secure.SpringSecurity.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	
	@Before("execution (* com.secure.SpringSecurity.service.UserDataService.*(..))")
	public void logMethodCall() {
		LOGGER.info("Method is Called");
	}
	
}
