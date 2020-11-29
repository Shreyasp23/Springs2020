package com.sam.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.sam.aopdemo.Account;

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
	
	
	@AfterReturning(pointcut="execution(* com.sam.aopdemo.dao.AccountDAO.getAllAccounts(..))",
					returning="result")
	public void afterReturning(JoinPoint thePoint, List<Account> result) {
		System.out.println("===========> After returning ");
		System.out.println("===========> Result "+ result);
		
		if(result.get(3).getName()=="Sam3") {
			result.set(3, new Account("sam4","Red"));
		}
		
	}
	
	
	
	

	
}
