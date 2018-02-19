package com.erojas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.erojas.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Integer>{

	@Query("select new  com.erojas.model.Phone(p.id , p.type , p.phoneNumber , p.areaCode) from phone p"
			+ " where p.employee.id= :idEmployee")
	List<Phone> getPhoneByEmployeeID(@Param("idEmployee") Integer idEmployee) throws Exception;


	@Query("select p.employee.id from phone p where p.id = :idPhone ")
	Integer getIdEmployeeByPhoneID(@Param("idPhone") Integer idPhone)throws Exception;
}
