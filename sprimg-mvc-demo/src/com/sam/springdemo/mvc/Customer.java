package com.sam.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sam.springdemo.mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@CourseCode(value= {"SHR","LUV"} ,message="Should start with SHR")
	private String courseCode;

	@NotNull(message = "is requried")
	@Size(min = 1, message = "is requried")
	private String lastName;
	@Pattern(regexp = "[0-9]{5}", message = "It must of 5 chars only")
	private String pinCode;

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@NotNull(message = "is requried")
	@Min(value = 0, message = "mustbe greaterthan 0")
	@Max(value = 100, message = "mustbe greaterthan 0")
	private Integer freePasses;

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
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

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
