package com.erojas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavegacionController {

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String init(Model model) {
		return "index";
	}
	@RequestMapping(path="/navegacion/goLogin", method=RequestMethod.GET)
	public String goLogin(Model model) {
		return "login";
	}
	@RequestMapping(path="/navegacion/goInicio", method=RequestMethod.GET)
	public String goInicio(Model model) {
		return "index";
	}
	
}
