package com.vmaffioli.apirest.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.vmaffioli.apirest.exception.ExceptionResponse;
import com.vmaffioli.apirest.exception.InternalRequestException;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(InternalRequestException.class)
	public ResponseEntity<ExceptionResponse> handleInternalserverException(Throwable ex, WebRequest request) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(),
				"critical message here");
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionResponse> handleMethodArgumentNotValid(Throwable ex, WebRequest request) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(),
				"BAD REQUEST");
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
// TODO exection handler
}
