package com.sam.aopdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class SamExpressions {
	

	@Pointcut("execution( * com.sam.aopdemo.dao.*.*(..))")
	public void forPackageDao() {}
	
	@Pointcut("execution(* com.sam.aopdemo.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution(* com.sam.aopdemo.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("forPackageDao() && !(getter() || setter())")
	public void combo() {}
}
