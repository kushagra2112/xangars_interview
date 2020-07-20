package com.xangars.interview.exceptions;


import org.springframework.stereotype.Service;

@Service
public class TokenNotValidException extends RuntimeException{
	static final long serialVersionUID = 4 ;
	public TokenNotValidException() {
		
	}

	public TokenNotValidException(String message, Throwable cause) {
		super(message, cause);
	}

	public TokenNotValidException(String message) {
		super(message);
	}

	public TokenNotValidException(Throwable cause) {
		super(cause);
	}
	
}