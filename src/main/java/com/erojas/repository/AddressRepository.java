package com.erojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.erojas.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{


	@Query("select a.id from address a where a.employee.id = :idEmployee")
	Integer getIdAddressByEmployeeID(@Param("idEmployee") Integer idEmployee) throws Exception;

	@Query(" select a.employee.id from address a where a.id = :idAddress")
	Integer getIdEmployeeByAddressId(@Param("idAddress") Integer idAddress)throws Exception;

}
