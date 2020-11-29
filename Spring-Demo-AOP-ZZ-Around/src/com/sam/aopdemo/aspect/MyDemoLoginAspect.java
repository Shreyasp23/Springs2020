package com.sam.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	
	@AfterThrowing(pointcut="execution(* com.sam.aopdemo.dao.AccountDAO.getAllAccounts(..))",
				   throwing="exe")
	public void afterThrowing(JoinPoint thePoint, Throwable exe) {
		System.out.println("===========> After throwing");
		System.out.println("===========>  throwing message  "+exe);
	}
	
	@After("com.sam.aopdemo.aspect.SamExpressions.forPackageDao()")
	public void afterAdvice() {
		System.out.println("After advice method");
	}
	
	@Around("execution(* com.sam.aopdemo.service.TrafficFortuneService.getFortune(..))")
	public Object aroundAdvice(ProceedingJoinPoint theJointPoint) throws Throwable {
		System.out.println("method name"+ theJointPoint.getSignature().toShortString());
		System.out.println("<+++++++++++++++>1st Around advice executing");
		
		long start= System.currentTimeMillis();
		
		Object result = theJointPoint.proceed();
		
		long end = System.currentTimeMillis();
		
		System.out.println("<+++++++++++++++>2nd Around advice executing  " + (end-start));
		
		return result;
	}
	
}
