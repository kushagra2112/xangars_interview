package com.xangars.interview.exceptions;

import org.springframework.stereotype.Service;

@Service
public class PolicyNumberException extends RuntimeException {
	
	static final long serialVersionUID = 3 ;
	public PolicyNumberException() {
		
	}

	public PolicyNumberException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public PolicyNumberException(String message) {
		super(message);
		
	}

	public PolicyNumberException(Throwable cause) {
		super(cause);
		
	}

}
