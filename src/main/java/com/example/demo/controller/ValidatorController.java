package com.example.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RequestPojo;

@RestController
public class ValidatorController {

	@PostMapping(value = "/testRequest", produces = { "application/json" })

	public String hello(@Validated @RequestBody RequestPojo request) {
		return "Hello!!!" + request.getName();
	}

}
