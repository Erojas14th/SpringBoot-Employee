package com.erojas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erojas.model.Employee;
import com.erojas.repository.EmployeeRepository;
import com.erojas.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository dao;

	@Override
	public List<Employee> findAll() throws Exception {
		return dao.findAll();
	}

	@Override
	public Employee findOne(Integer codigo) throws Exception {
		return dao.findOne(codigo);
	}

	@Override
	public void delete(Integer codigo) throws Exception {
	dao.delete(codigo);
		
	}

	@Override
	public void save(Employee employee) throws Exception {
		dao.save(employee);
		
	}

	@Override
	public void update(Employee employee) throws Exception {
		  if(employee.getId()!=null  || employee.getId()!=0 ) {
       	   dao.save(employee);
          }
		
	}
}
