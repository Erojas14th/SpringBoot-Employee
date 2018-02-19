package com.erojas.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.erojas.model.Employee;
import com.erojas.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService es;

	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public String getListEmployee(Model model) {

	
		try {
			
			model.addAttribute("list", getListEmployee());
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return "employeeList";
	}

	@RequestMapping(path = "/surfing", method = RequestMethod.GET)
	public String surfingEmployeeUpdate(Model model, @RequestParam("id") Integer id) {
		Employee em;

		try {
			if (id!=0) {
				em = es.findOne(id);
				// Foto display
				 byte[] encodeBase64 = Base64.getEncoder().encode(em.getFoto());
				 String base64Encoded = new String(encodeBase64, "UTF-8");
				 model.addAttribute("foto",base64Encoded);
			} else {
				em = new Employee();
				
			}
			
			model.addAttribute("employee", em);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "employeeUpdate";
	}
	
	@RequestMapping(path = "/delete", method = RequestMethod.GET)
	public String deleteEmployee(Model model, @RequestParam("id") Integer id) {
		
	
		try{
			if(id != null && id > 0){
				es.delete(id);
			}
			
			model.addAttribute("list", getListEmployee());
		}catch(Exception e){e.printStackTrace();}
		return "employeeList";
	}
	
	
	
	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public String updateEmployee(Model model, 
			@RequestParam("id") Integer id,
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("salary") Double salary,
			@RequestParam("startDate") String startDate,
			@RequestParam("endDate") String endDate,
			@RequestParam("foto") MultipartFile foto) {
		
		Employee em = new Employee();
		em.setId(id);
		em.setFirstName(firstName);
		em.setLastName(lastName);
		em.setSalary(salary);
		
		
		try {
			if(startDate!=null  && endDate!=null){
        		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        		em.setStartDate(formatter.parse(startDate));
   			 em.setEndDate(formatter.parse(endDate));
        	}
			
			if(foto.getSize()>0){
				em.setFoto(foto.getBytes());
			}
			
			if(id!=null && id>0){
				es.update(em);
			}else{
				es.save(em);
			}
			
			model.addAttribute("list", getListEmployee());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return "employeeList";
	}

	
	// Get List Employee
	public List<Employee> getListEmployee(){
		List<Employee> list = new ArrayList<>();
		try {
			list=es.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
