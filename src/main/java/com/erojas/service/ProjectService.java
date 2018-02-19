package com.erojas.service;

import java.util.List;

import com.erojas.model.Project;

public interface ProjectService {

	List<Project> findAll() throws Exception;
	Project findOne(Integer codigo) throws Exception;
	void delete(Integer codigo) throws Exception;
	void save(Project project) throws Exception;
	void update(Project project) throws Exception;
	
}
