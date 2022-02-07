package com.example.zerobase.web.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import com.example.zerobase.web.exception.ExceptionCode;
import com.example.zerobase.web.exception.InvalidStatusException;
import com.example.zerobase.web.exception.NotFoundCourseException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = NotFoundCourseException.class)
	public ResponseEntity<ErrorResult> notFoundException(NotFoundCourseException e) {

		ExceptionCode code = e.getCode();

		return getResponseEntity(code);
	}

	@ExceptionHandler(value = InvalidStatusException.class)
	public ResponseEntity<ErrorResult> invalidStatusException(InvalidStatusException e) {

		ExceptionCode code = e.getCode();

		return getResponseEntity(code);
	}

	private ResponseEntity getResponseEntity(ExceptionCode code) {
		ErrorResult errorResult = ErrorResult.builder()
			.code(code.name())
			.message(code.getMessage())
			.build();
		return new ResponseEntity(errorResult, code.getStatus());
	}

}
