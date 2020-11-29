package com.sam.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-1)
public class MyDemoLoginAspect {
	
	
	@Before("com.sam.aopdemo.aspect.SamExpressions.combo()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		
		MethodSignature sig = (MethodSignature)theJoinPoint.getSignature();
		
		Object[] args = theJoinPoint.getArgs();
		
		for(Object arg:args) {
			System.out.println("agrs--->"+arg.toString());
			
		}
		System.out.println("===========> executing"+sig);
		
		
	}
	
	
	

	
}
