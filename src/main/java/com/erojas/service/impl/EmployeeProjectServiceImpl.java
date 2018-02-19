package com.erojas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erojas.model.EmployeeProject;
import com.erojas.repository.EmployeeProjectRepository;
import com.erojas.service.EmployeeProjectService;

@Service
public class EmployeeProjectServiceImpl implements EmployeeProjectService{

	@Autowired
	private EmployeeProjectRepository dao;
	
	@Override
	public List<EmployeeProject> findAll() throws Exception {
	
		return dao.findAll();
	}

	@Override
	public EmployeeProject findOne(Integer codigo) throws Exception {
		
		return dao.findOne(codigo);
	}

	@Override
	public void delete(Integer codigo) throws Exception {
		dao.delete(codigo);
		
	}

	@Override
	public void save(EmployeeProject employeeProject) throws Exception {
		dao.save(employeeProject);
		
	}

	@Override
	public void update(EmployeeProject employeeProject) throws Exception {
		   if(employeeProject.getId()!=null  || employeeProject.getId()!=0 ) {
        	   dao.save(employeeProject);
           }
		
	}

	@Override
	public List<EmployeeProject> getEmployeeProjectByEmployeeID(Integer idEmplyee) throws Exception {
		
		return dao.getEmployeeProjectByEmployeeID(idEmplyee);
	}

	@Override
	public List<EmployeeProject> getEmployeeProjectByProjectID(Integer idProject) throws Exception {
		
		return dao.getEmployeeProjectByProjectID(idProject);
	}

	@Override
	public Integer getIdEmployeeByEmployeeProjectID(Integer idEmployeeProject) throws Exception {
		return dao.getIdEmployeeByEmployeeProjectID(idEmployeeProject);
	}

	@Override
	public Integer getIdProjectByEmployeeProjectID(Integer idEmployeeProject) throws Exception {
		return dao.getIdProjectByEmployeeProjectID(idEmployeeProject);
	}



}
