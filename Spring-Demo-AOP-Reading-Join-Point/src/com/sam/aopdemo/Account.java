package com.sam.aopdemo;

public class Account {
	private String name;
	private String level;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Account(String name, String level) {
		super();
		this.name = name;
		this.level = level;
	}
	
	
	
	
}