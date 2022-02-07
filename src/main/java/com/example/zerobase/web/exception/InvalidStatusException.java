package com.example.zerobase.web.exception;

import lombok.Getter;

@Getter
public class InvalidStatusException extends RuntimeException {
	private final ExceptionCode code;

	public InvalidStatusException(ExceptionCode code) {
		this.code = code;
	}

	public InvalidStatusException(String message, ExceptionCode code) {
		super(message);
		this.code = code;
	}

	public InvalidStatusException(String message, Throwable cause, ExceptionCode code) {
		super(message, cause);
		this.code = code;
	}

	public InvalidStatusException(Throwable cause, ExceptionCode code) {
		super(cause);
		this.code = code;
	}

	public InvalidStatusException(String message, Throwable cause, boolean enableSuppression,
		boolean writableStackTrace,
		ExceptionCode code) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.code = code;
	}
}
