package com.jit.springboot.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class AddressValidator implements ConstraintValidator<AddressValidation, String> {
	
	List<String> adddress = Arrays.asList("Noida","Delhi");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {	
		return adddress.contains(value);
	}

}
