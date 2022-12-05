package com.example.exception;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.example.model.response.exception.ErrorDetail;

public class BusinessException extends Exception {

	private static final long serialVersionUID = 6170617629481041897L;
	private String instanceId;
	private HttpStatus errorCode;
	private String responseBody;
	private List<ErrorDetail> errors;

	public BusinessException(String errorMessage) {
		super(errorMessage);
		this.errorCode = HttpStatus.UNPROCESSABLE_ENTITY;
	}

	public BusinessException(HttpStatus status,String errorMessage) {
		super(errorMessage);
		this.errorCode = status;
	}
	public BusinessException(String errorMessage , List<ErrorDetail> errors) {
		super(errorMessage);
		this.errorCode = HttpStatus.UNPROCESSABLE_ENTITY;
		this.errors = errors ;
	}
	public BusinessException(String errorMessage , List<ErrorDetail> errors , String responseBody ) {
		super(errorMessage);
		this.errorCode = HttpStatus.UNPROCESSABLE_ENTITY;
		this.errors = errors ;
		this.responseBody = responseBody;
	}
	public BusinessException(String instanceId,String errorMessage , List<ErrorDetail> errors ) {
		super(errorMessage);
		this.instanceId = instanceId ;
		this.errorCode = HttpStatus.UNPROCESSABLE_ENTITY;
		this.errors = errors ;
	}

	public BusinessException(String instanceId,String errorMessage) {
		super(errorMessage);
		this.instanceId = instanceId ;
	}
	public HttpStatus getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(HttpStatus errorCode) {
		this.errorCode = errorCode;
	}

	public List<ErrorDetail> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorDetail> errors) {
		this.errors = errors;
	}
	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}


}
