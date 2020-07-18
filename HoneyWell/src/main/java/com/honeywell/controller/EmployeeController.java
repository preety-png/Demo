package com.honeywell.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.honeywell.exception.EmployeeNotPresentException;
import com.honeywell.model.Employee;
import com.honeywell.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	// create employee
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee) {
		Employee res = empService.createEmployeeService(employee);

		return new ResponseEntity<Employee>(res, HttpStatus.OK);
	}

	// get all employee
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getUserDetails() {

		List<Employee> res = empService.getAllEmployeeService();

		return new ResponseEntity(res, HttpStatus.OK);

	}

	// get employee by id
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getUserDetailsById(@PathVariable("id") Long id) {

		Employee res = empService.getEmployeeByIdService(id);
		if (res != null) {
			return new ResponseEntity<Employee>(res, HttpStatus.OK);

		}
		throw new EmployeeNotPresentException("Invalid employee id-" + id);

	}

	// delete employee by id
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	public ResponseEntity deleteUserDetailsById(@PathVariable("id") Long id) {

		boolean res = empService.deleteEmployeeByIdService(id);
		return new ResponseEntity(res, HttpStatus.OK);
	}

}
