package com.sam.aopdemo.dao;

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
}
