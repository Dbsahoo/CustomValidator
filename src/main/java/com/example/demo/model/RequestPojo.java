package com.example.demo.model;

import com.example.demo.validators.PhoneNumberConstraint;

public class RequestPojo {

	private String name;

	@PhoneNumberConstraint
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
