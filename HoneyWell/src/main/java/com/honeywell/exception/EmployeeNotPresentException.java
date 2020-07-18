package com.honeywell.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotPresentException  extends RuntimeException {

	public EmployeeNotPresentException(String exception) {
		super(exception);
	}

}
