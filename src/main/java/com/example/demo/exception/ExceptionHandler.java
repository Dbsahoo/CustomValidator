package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler {

	@ResponseBody
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> genericExceptionMessage(Exception exception) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setCode("InvalidRequest");
		errorResponse.setDetails(exception.getMessage());
		errorResponse.setType("Error");
		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
	}

}
