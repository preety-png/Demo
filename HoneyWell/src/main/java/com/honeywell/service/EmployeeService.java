/**
 * 
 */
package com.honeywell.service;

import java.util.List;
import com.honeywell.model.Employee;

public interface EmployeeService {
	

	public List<Employee> getAllEmployeeService();

	public Employee createEmployeeService(Employee employee);

	public boolean deleteEmployeeByIdService(Long id);

	public Employee getEmployeeByIdService(Long id);

}
