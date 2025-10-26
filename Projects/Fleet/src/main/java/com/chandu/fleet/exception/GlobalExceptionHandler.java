package com.chandu.fleet.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.chandu.fleet.entity.ErrorResponseForBankAccountNotFound;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BankAccountNotFound.class)
	public  ResponseEntity<?> handleAccountNotFoundException(BankAccountNotFound accountNotFound) {
		ErrorResponseForBankAccountNotFound  bankAccountNotFound = new ErrorResponseForBankAccountNotFound(LocalDateTime.now(), accountNotFound.getMessage(), "bank account not found");
		
		return new ResponseEntity<>(bankAccountNotFound,HttpStatus.NOT_FOUND);
		
	}
	
}
