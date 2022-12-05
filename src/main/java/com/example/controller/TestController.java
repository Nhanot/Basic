package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.ValidationException;
import com.example.model.response.exception.ErrorDetail;

@RequestMapping
@RestController
public class TestController {
	
	@GetMapping("/test")
	public Object testErrorHandle() throws Exception{
		
		List<ErrorDetail> errors = new ArrayList<>();
		errors.add(new ErrorDetail("id123", "testError"));
		
		throw new ValidationException("Validation Fail",errors);
	}
	
}
