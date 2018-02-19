package com.erojas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity(name="employee_project")
@Table(name="employee_project")
@IdClass(EmployeeProjectPK.class)
public class EmployeeProject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false)
	private Integer id;
	
	@Id
	private Employee employee;
	
	@Id
	private Project project;

	
	
	
	
	public EmployeeProject(Integer id) {
		
		this.id = id;
	}

	public EmployeeProject() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
	
	
}
