package com.example.model.response.exception;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExceptionRespDto {
	private String id ;
	private String message ;
	private List<ErrorDetail> errors;
}
