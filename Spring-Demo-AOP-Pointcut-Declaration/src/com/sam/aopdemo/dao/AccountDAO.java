package com.sam.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.sam.aopdemo.Account;

@Component
public class AccountDAO {
	public void addAccount(Account acc, int a) {
		System.out.println("Connecting to db "+ getClass());
	}
	
	public void addMemberShip() {
		System.out.println("Adding Membership");
	}
}
