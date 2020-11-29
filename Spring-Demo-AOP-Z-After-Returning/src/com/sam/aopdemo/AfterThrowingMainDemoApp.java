package com.sam.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sam.aopdemo.dao.AccountDAO;

public class AfterThrowingMainDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
		//Get bean from the spring container
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		List<Account> acc=null;
		try {
			Boolean flag=true;
			acc = accountDAO.getAllAccounts(flag);
		} catch (Exception e) {
			System.out.println("Exception caught "+e);
			
		}
		
		System.out.println("Accounts=========>"+ acc);
		
		context.close();

	}

}
