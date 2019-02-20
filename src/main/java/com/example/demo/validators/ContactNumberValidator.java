package com.example.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<PhoneNumberConstraint, String> {

	@Override
	public void initialize(PhoneNumberConstraint contactField) {
	}

	@Override
	public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
		return contactField != null && contactField.matches("[0-9]+") && (contactField.length() > 8)
				&& (contactField.length() < 14);
	}

}
