package com.bank.retailbanking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class MortgageException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public MortgageException(String exception) {
		super(exception);
	}
}