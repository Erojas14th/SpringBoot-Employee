package com.erojas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erojas.model.Project;
import com.erojas.repository.ProjectRepository;
import com.erojas.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectRepository  dao;
	
	@Override
	public List<Project> findAll() throws Exception {
	
		return dao.findAll();
	}

	@Override
	public Project findOne(Integer codigo) throws Exception {
		
		return dao.findOne(codigo);
	}

	@Override
	public void delete(Integer codigo) throws Exception {
		dao.delete(codigo);
		
	}

	@Override
	public void save(Project project) throws Exception {
		dao.save(project);
		
	}

	@Override
	public void update(Project project) throws Exception {
		   if(project.getId()!=null  || project.getId()!=0 ) {
        	   dao.save(project);
           }
		
	}

}
