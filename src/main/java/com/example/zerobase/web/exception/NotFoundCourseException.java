package com.example.zerobase.web.exception;

import lombok.Getter;

@Getter
public class NotFoundCourseException extends RuntimeException {
	private final ExceptionCode code;

	public NotFoundCourseException(ExceptionCode code) {
		this.code = code;
	}

	public NotFoundCourseException(String message, ExceptionCode code) {
		super(message);
		this.code = code;
	}

	public NotFoundCourseException(String message, Throwable cause, ExceptionCode code) {
		super(message, cause);
		this.code = code;
	}

	public NotFoundCourseException(Throwable cause, ExceptionCode code) {
		super(cause);
		this.code = code;
	}

	public NotFoundCourseException(String message, Throwable cause, boolean enableSuppression,
		boolean writableStackTrace,
		ExceptionCode code) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.code = code;
	}
}
