package com.naged.onboarding.exception;

public class ResponseException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private final String message;
	private final String responseCode;
	public ResponseException(String message, String responseCode) {
		super(message);
		this.message = message;
		this.responseCode=responseCode;
	}
	@Override
	public String getMessage() {
		return message;
	}
}