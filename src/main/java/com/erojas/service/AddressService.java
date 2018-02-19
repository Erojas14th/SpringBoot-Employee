package com.erojas.service;

import java.util.List;

import com.erojas.model.Address;



public interface AddressService {

	List<Address> findAll() throws Exception;
	Address findOne(Integer codigo) throws Exception;
	void delete(Integer codigo) throws Exception;
	void save(Address address) throws Exception;
	void update(Address address) throws Exception;
	
	//  Methods Relationship
	Integer getIdAddressByEmployeeID(Integer idEmployee) throws Exception;
	Integer getIdEmployeeByAddressId(Integer idAddress)throws Exception;

}
