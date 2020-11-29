package com.sam.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoginAspect {
	
	@Before("execution( * com.sam.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("===========> executing @Before");
	}
}
