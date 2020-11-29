package com.sam.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-1)
public class MyDemoLoginAspect {
	
	
	@Before("com.sam.aopdemo.aspect.SamExpressions.combo()")
	public void beforeAddAccountAdvice() {
		System.out.println("===========> executing @Before");
	}
	
	
	

	
}
