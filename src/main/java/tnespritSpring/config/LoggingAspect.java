package tnespritSpring.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	private static final Logger l = LogManager.getLogger(LoggingAspect.class);
	
	@Before("execution(* tn.espritSpring.services..*.*(..))")
	public void logMethodEntry(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		l.info("In Method "+ name + " : ");
	}
	
	@After("execution(* tn.espritSpring.services..*.*(..))")
	public void logMethodExit(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		l.info("Out of Method "+ name);
	}
	
	@Around("execution(* tn.espritSpring.services..*.*(..))")
	public Object profile(ProceedingJoinPoint pjp) throws Throwable{
		long start = System.currentTimeMillis();
		Object obj = pjp.proceed();
		long execTime = System.currentTimeMillis() - start;
		l.info("Method Execution Time is around "+ execTime + "ms");
		return obj;
	}
	
	

}
