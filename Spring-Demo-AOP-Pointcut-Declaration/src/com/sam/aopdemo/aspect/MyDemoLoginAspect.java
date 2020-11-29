package com.sam.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoginAspect {
	
	@Pointcut("execution( * com.sam.aopdemo.dao.*.*(..))")
	private void forPackageDao() {}
	
	@Before("forPackageDao()")
	public void beforeAddAccountAdvice() {
		System.out.println("===========> executing @Before");
	}
	
	@Before("forPackageDao()")
	public void performApiAnalytics() {
		System.out.println("Doing imp STUFF++++++++++>>>>>>>>>");
	}
}
