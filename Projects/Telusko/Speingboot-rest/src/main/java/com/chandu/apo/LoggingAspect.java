package com.chandu.apo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	
	@Before("execution(* com.chandu.service.JobService.getAllJobs(..))")
	public void logMethodCall(JoinPoint jp) {
		LOGGER.info("getAllJobs Method Called "+jp.getSignature().getName());
	}
	

	@After("execution(* com.chandu.service.JobService.getAllJobs(..))")
	public void logMethodExecuted(JoinPoint jp) {
		LOGGER.info("getAllJobs Method Executed "+jp.getSignature().getName());
	}
	
	@AfterThrowing("execution(* com.chandu.service.JobService.getAllJobs(..))")
	public void logMethodCrashed(JoinPoint jp) {
		LOGGER.info("getAllJobs Method Crashed may be some issues "+jp.getSignature().getName());
	}
	
	@AfterReturning("execution(* com.chandu.service.JobService.getAllJobs(..))")
	public void logMethodExecutedSuccess(JoinPoint jp) {
		LOGGER.info("getAllJobs Method Executed successfully "+jp.getSignature().getName());
	}

}
