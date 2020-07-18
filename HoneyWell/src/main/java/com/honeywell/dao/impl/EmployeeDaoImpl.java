package com.honeywell.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.honeywell.dao.Dao;
import com.honeywell.model.Employee;

@Transactional
@Repository
public class EmployeeDaoImpl implements Dao<Employee> {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Employee get(long id) {
		return entityManager.find(Employee.class, id);
	}

	@Override
	public List<Employee> getAll() {
		Query query = entityManager.createQuery("SELECT e FROM Employee e");

		return query.getResultList();
	}

	@Override
	public Employee save(Employee employee) {
		entityManager.persist(employee);
		Long id = employee.getId();
		return entityManager.find(Employee.class, id);

	}

	@Override
	public boolean delete(Employee employee) {
		if (entityManager.contains(employee))
			entityManager.remove(employee);
		else
			entityManager.remove(entityManager.merge(employee));

		return true;

	}

}
