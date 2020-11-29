package com.sam.springdemo.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student {

	public String firstName;
	public String lang;
	
	public List<String> os = new ArrayList<String>();
	
	public List<String> getOs() {
		return os;
	}
	public void setOs(List<String> os) {
		this.os = os;
	}
	List<String> languages= new ArrayList<String>();
	public  Student() {
		 
		languages.add("Eng");
		languages.add("Kan");
		languages.add("Hin");
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public String getLang() {
		return lang;
	}
	
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	public String lastName;
	public String fullName;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String country;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
