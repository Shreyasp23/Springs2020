package com.sam.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sam.aopdemo.dao.AccountDAO;
import com.sam.aopdemo.dao.MemberShipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
		//Get bean from the spring container
		AccountDAO account = context.getBean("accountDAO",AccountDAO.class);
		MemberShipDAO member =context.getBean("memberShipDAO",MemberShipDAO.class);
		Account acc = new Account("Shreyas","One");
		
		account.addAccount(acc,3);
		
		/*account.setName("Sam");
		account.setServiceCode("eno ondu");
		
		String name = account.getName();
		String code = account.getServiceCode();
		*/
		System.out.println("Doing it again");
		
		account.addMemberShip();
		
		member.addMemberShip();
		
		context.close();

	}

}
