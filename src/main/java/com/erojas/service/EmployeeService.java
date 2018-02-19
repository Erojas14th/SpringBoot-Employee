package com.erojas.service;

import java.util.List;

import com.erojas.model.Employee;

public interface EmployeeService {

	List<Employee> findAll() throws Exception;
	Employee findOne(Integer codigo) throws Exception;
	void delete(Integer codigo) throws Exception;
	void save(Employee employee) throws Exception;
	void update(Employee employee) throws Exception;
}
