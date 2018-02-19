package com.erojas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erojas.model.Phone;
import com.erojas.repository.PhoneRepository;
import com.erojas.service.PhoneService;

@Service
public class PhoneServiceImpl implements PhoneService{

	@Autowired
	private PhoneRepository dao;
	
	@Override
	public List<Phone> findAll() throws Exception {
		return dao.findAll();
	}

	@Override
	public Phone findOne(Integer codigo) throws Exception {
		return dao.findOne(codigo);
	}

	@Override
	public void delete(Integer codigo) throws Exception {
		dao.delete(codigo);
		
	}

	@Override
	public void save(Phone phone) throws Exception {
		dao.save(phone);
		
	}

	@Override
	public void update(Phone phone) throws Exception {
		 if(phone.getId()!=null  || phone.getId()!=0 ) {
      	   dao.save(phone);
         }
		
	}

	@Override
	public List<Phone> getPhoneByEmployeeID(Integer idEmployee) throws Exception {
		
		return dao.getPhoneByEmployeeID(idEmployee);
	}

	@Override
	public Integer getIdEmployeeByPhoneID(Integer idPhone) throws Exception {
		return dao.getIdEmployeeByPhoneID(idPhone);
	}

}
