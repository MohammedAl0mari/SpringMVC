package com.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.cglib.core.Constants;

public class PhoneValidator implements ConstraintValidator<checkPhoneNumber, String>{
	
	private String myCode;
	@Override
	public void initialize(checkPhoneNumber phone) 
	{
		myCode=phone.value();
	}
	@Override
	public boolean isValid(String phone, ConstraintValidatorContext arg1) {
		boolean Result;
		if(phone != null) 
		{
			Result = phone.startsWith(myCode) && phone.length()==14;
		}else {
			Result =true;
		}
		return Result;
	}

}
