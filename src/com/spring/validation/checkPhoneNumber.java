package com.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;



@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD , ElementType.METHOD})
@Constraint(validatedBy = PhoneValidator.class)
public @interface checkPhoneNumber {
	public String value() default "+962";
	public String message() default "Invalid phone number";
	
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};
}
