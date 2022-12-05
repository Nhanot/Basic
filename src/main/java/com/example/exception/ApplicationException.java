package com.example.exception;

import java.util.List;

import com.example.model.response.exception.ErrorDetail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ApplicationException extends Exception {


	private static final long serialVersionUID = -5462701320526226525L;

	private String message;
	private List<ErrorDetail> errors ;

    public ApplicationException(String errorMessage) {
        super(errorMessage);
    }

}
