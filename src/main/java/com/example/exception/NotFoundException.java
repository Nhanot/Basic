package com.example.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	private String id ;

}
