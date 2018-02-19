package com.erojas.service;

import java.util.List;

import com.erojas.model.Phone;

public interface PhoneService {

	List<Phone> findAll() throws Exception;
	Phone findOne(Integer codigo) throws Exception;
	void delete(Integer codigo) throws Exception;
	void save(Phone phone) throws Exception;
	void update(Phone phone) throws Exception;
	
	// Methods Relationship
	List<Phone> getPhoneByEmployeeID( Integer idEmployee) throws Exception;
	Integer getIdEmployeeByPhoneID( Integer idPhone)throws Exception;
}
