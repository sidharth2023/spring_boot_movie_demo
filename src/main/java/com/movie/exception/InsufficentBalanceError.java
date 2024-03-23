package com.movie.exception;

public class InsufficentBalanceError extends RuntimeException {
	

	public InsufficentBalanceError(String message) {
		super(message);
	}
}
