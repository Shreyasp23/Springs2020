package com.sam.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(21)
public class AddCloudLogAspect {
	@Before("com.sam.aopdemo.aspect.SamExpressions.forPackageDao()")
	public void logToCloudAsync() {
		System.out.println("Doing imp STUFF++++++++++>>>>>>>>>logToCloudAsync");
	}
}
