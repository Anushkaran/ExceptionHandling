package com.Productss;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(GivenNameNotFoundException.class)
	public ResponseEntity<Object> givennamenotfound(GivenNameNotFoundException g) {
		return new ResponseEntity<Object>(g.getMessage(),HttpStatus.BAD_REQUEST);	}

}
