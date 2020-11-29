package com.sam.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	 String[] coursePrefix;
	
	
	@Override
	public boolean isValid(String
			theCode, ConstraintValidatorContext constraintValidatorContext) {
		boolean result=false;
		String[] val = {"SHR" ,"LUV"};
		
		if(theCode!=null) {
			for(String vals: val) {
			 result=theCode.startsWith(vals);
			 
			 if(result)
				 break;
			}
		
		}else {
			result= true;
		}
	
		return result;
	}
	
	
	
	@Override
	public void initialize(CourseCode theCouseCode) {
		coursePrefix=theCouseCode.value();
	}


	
}
