package com.erojas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.erojas.model.EmployeeProject;

public interface EmployeeProjectRepository extends JpaRepository<EmployeeProject, Integer> {

	
	// Relations with Employee
	@Query("select new com.erojas.model.EmployeeProject(ep.id) from employee_project ep"
			+ " where ep.employee.id = :idEmplyee ")
	List<EmployeeProject> getEmployeeProjectByEmployeeID(@Param("idEmplyee") Integer idEmplyee) throws Exception;
	

	@Query("select ep.employee.id from  employee_project ep  where ep.id= :idEmployeeProject")
	Integer getIdEmployeeByEmployeeProjectID(@Param("idEmployeeProject") Integer idEmployeeProject)throws Exception;
	
	// Relations with Projects
	
	@Query("select new com.erojas.model.EmployeeProject(ep.id) from employee_project ep"
			+ " where ep.project.id = :idProject ")
	List<EmployeeProject> getEmployeeProjectByProjectID(@Param("idProject") Integer idProject) throws Exception;
	
	@Query("select ep.project.id  from employee_project ep  where ep.id= :idEmployeeProject")
	Integer getIdProjectByEmployeeProjectID(@Param("idEmployeeProject") Integer idEmployeeProject)throws Exception;

}
