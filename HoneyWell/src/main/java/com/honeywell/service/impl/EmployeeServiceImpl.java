/**
 * 
 */
package com.honeywell.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honeywell.dao.impl.EmployeeDaoImpl;
import com.honeywell.model.Employee;
import com.honeywell.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDaoImpl empDao;

	@Override
	public List<Employee> getAllEmployeeService() {
		return empDao.getAll();
	}

	@Override
	public Employee createEmployeeService(Employee employee) {
		return empDao.save(employee);
	}

	@Override
	public boolean deleteEmployeeByIdService(Long id) {
		Employee user = new Employee();
		user.setId(id);
		return empDao.delete(user);
	}

	@Override
	public Employee getEmployeeByIdService(Long id) {
		Employee user = empDao.get(id);
		return user;
	}

}
