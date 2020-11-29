package com.sam.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sam.aopdemo.Account;

@Component
public class AccountDAO {
	
	public String name;
	public String serviceCode;
	
	
	
	public String getName() {
		System.out.println("Working is  getName");
		return name;
	}

	public void setName(String name) {
		System.out.println("Working is  setName");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println("Working is  getServiceCode");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println("Working is  setServiceCode");
		this.serviceCode = serviceCode;
	}

	public void addAccount(Account acc, int a) {
		System.out.println("Connecting to db "+ getClass());
	}
	
	public void addMemberShip() {
		System.out.println("Adding Membership");
	}
	
	public List<Account> getAllAccounts(Boolean flag){
		
		if(flag) {
			throw new RuntimeException("No Account fuck You");
		}
		
		
		List<Account> accs = new ArrayList<>();
		
		Account A1 = new Account("Sam","Platinum");
		Account A2 = new Account("Sam1","Gold");
		Account A3 = new Account("Sam2","Silver");
		Account A4 = new Account("Sam3","Platinum");
		
		accs.add(A1);
		accs.add(A2);
		accs.add(A3);
		accs.add(A4);
		
		return accs;
		
	}
}
