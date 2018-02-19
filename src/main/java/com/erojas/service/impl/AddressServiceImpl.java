package com.erojas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erojas.model.Address;
import com.erojas.repository.AddressRepository;
import com.erojas.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository dao;
	
	@Override
	public List<Address> findAll() throws Exception {
		
		return dao.findAll();
	}

	@Override
	public Address findOne(Integer codigo) throws Exception {
	
		return dao.findOne(codigo);
	}

	@Override
	public void delete(Integer codigo) throws Exception {
		dao.delete(codigo);
		
	}

	@Override
	public void save(Address address) throws Exception {
		dao.save(address);
		
	}

	@Override
	public void update(Address address) throws Exception {
           if(address.getId()!=null  || address.getId()!=0 ) {
        	   dao.save(address);
           }
		
	}

	@Override
	public Integer getIdAddressByEmployeeID(Integer idEmployee) throws Exception {
		return dao.getIdAddressByEmployeeID(idEmployee);
	}

	@Override
	public Integer getIdEmployeeByAddressId(Integer idAddress) throws Exception {
		return dao.getIdEmployeeByAddressId(idAddress);
	}

}
