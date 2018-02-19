package com.erojas.service;

import java.util.List;

import com.erojas.model.EmployeeProject;

public interface EmployeeProjectService {
	List<EmployeeProject> findAll() throws Exception;
	EmployeeProject findOne(Integer codigo) throws Exception;
	void delete(Integer codigo) throws Exception;
	void save(EmployeeProject employeeProject) throws Exception;
	void update(EmployeeProject employeeProject) throws Exception;
	
	// Methods Relationships
	// Relations with Employee
	List<EmployeeProject> getEmployeeProjectByEmployeeID(Integer idEmplyee) throws Exception;
	Integer getIdEmployeeByEmployeeProjectID(Integer idEmployeeProject)throws Exception;
	
	// Relations with Projects
	List<EmployeeProject> getEmployeeProjectByProjectID(Integer idProject) throws Exception;
	Integer getIdProjectByEmployeeProjectID(Integer idEmployeeProject)throws Exception;
}
