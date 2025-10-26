package com.chandu.apo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class performanceMonitorAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(performanceMonitorAspect.class);
	
	@Around("execution(* com.chandu.service.JobService.*(..))")
	public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {
		
		long start = System.currentTimeMillis();
		
	Object obj = jp.proceed();
		long last = System.currentTimeMillis();
		
		LOGGER.info("Time taken by "+jp.getSignature().getName()+" "+(last-start)+"ms");
		
		return obj;
		
	}

	
}
