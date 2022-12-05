package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.ValidationException;
import com.example.model.response.exception.ExceptionRespDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@ControllerAdvice
@RestController
public class Controller {
	
	@Autowired
	HttpServletRequest request;

	@Autowired
	HttpServletResponse response;
	
	protected void responseOK() {
		response.setStatus(HttpStatus.OK.value());
	}

	protected Object responseOK(Object data) {
		response.setStatus(HttpStatus.OK.value());
		return data;
	}
	
	 @ResponseStatus(HttpStatus.BAD_REQUEST)
		@ExceptionHandler({ ValidationException.class})
		public ExceptionRespDto responseValidationFail(ValidationException e) {
	    	e.printStackTrace();
	    	return ExceptionRespDto.builder().message(e.getMessage()).errors(e.getErrors()).build() ;
		}
}
