package com.sam.aopdemo.aspect;

import java.util.List;
import java.util.logging.Logger;

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
	
	private static Logger MyLogger = Logger.getLogger(MyDemoLoginAspect.class.getName());
	
	@Before("com.sam.aopdemo.aspect.SamExpressions.combo()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		
		MethodSignature sig = (MethodSignature)theJoinPoint.getSignature();
		
		Object[] args = theJoinPoint.getArgs();
		
		for(Object arg:args) {
			MyLogger.info("agrs--->"+arg.toString());
			
		}
		MyLogger.info("===========> executing"+sig);
		
		
	}
	
	
	@AfterReturning(pointcut="execution(* com.sam.aopdemo.dao.AccountDAO.getAllAccounts(..))",
					returning="result")
	public void afterReturning(JoinPoint thePoint, List<Account> result) {
		MyLogger.info("===========> After returning ");
		MyLogger.info("===========> Result "+ result);
		
		if(result.get(3).getName()=="Sam3") {
			result.set(3, new Account("sam4","Red"));
		}
		
	}
	
	
	@AfterThrowing(pointcut="execution(* com.sam.aopdemo.dao.AccountDAO.getAllAccounts(..))",
				   throwing="exe")
	public void afterThrowing(JoinPoint thePoint, Throwable exe) {
		MyLogger.info("===========> After throwing");
		MyLogger.info("===========>  throwing message  "+exe);
	}
	
	@After("com.sam.aopdemo.aspect.SamExpressions.forPackageDao()")
	public void afterAdvice() {
		MyLogger.info("After advice method");
	}
	
	@Around("execution(* com.sam.aopdemo.service.TrafficFortuneService.getFortune(..))")
	public Object aroundAdvice(ProceedingJoinPoint theJointPoint) throws Throwable {
		MyLogger.info("method name"+ theJointPoint.getSignature().toShortString());
		MyLogger.info("<+++++++++++++++>1st Around advice executing");
		
		long start= System.currentTimeMillis();
		
		Object result = theJointPoint.proceed();
		
		long end = System.currentTimeMillis();
		
		MyLogger.info("<+++++++++++++++>2nd Around advice executing  " + (end-start));
		
		return result;
	}
	
}
