package com.erojas.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.springframework.format.annotation.DateTimeFormat;





@Entity(name="employee")
@Table(name="employee")
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false)
	private Integer id;
	
	@Column(name="firstName",length=225)
	private String firstName;
	
	@Column(name="lastName",length=225)
	private String lastName;
	
	@Column(name="salary",columnDefinition="Decimal(10,2)")
	private Double salary;

	@Column(name="startDate")
	@Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;
	
	@Column(name="endDate")
	@Temporal(javax.persistence.TemporalType.DATE)
    private Date endDate;
	
	@OneToMany(mappedBy="employee",cascade={CascadeType.REMOVE,CascadeType.MERGE},fetch=FetchType.LAZY)
	private List<Phone> phones;

	@OneToMany(mappedBy="employee",cascade={CascadeType.REMOVE,CascadeType.MERGE},fetch=FetchType.LAZY)
	private List<EmployeeProject> employeeProjects;
	
	@OneToOne(mappedBy="employee")
	private Address address;
	
	private byte[] foto;
	
	
	public Employee() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}



	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	
	
	
	
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public List<EmployeeProject> getEmployeeProjects() {
		return employeeProjects;
	}

	public void setEmployeeProjects(List<EmployeeProject> employeeProjects) {
		this.employeeProjects = employeeProjects;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
