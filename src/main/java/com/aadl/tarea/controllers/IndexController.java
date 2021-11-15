package com.aadl.tarea.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aadl.tarea.models.domains.Vcard;

@Controller
public class IndexController {

	@Autowired
	private Vcard vcard;
	
	@RequestMapping("/")
	private String index() {
		return "index";
	}
	@RequestMapping("/vcards")
	private String vcard(Model model) {
		
		model.addAttribute("empleados", vcard);
		
		return "vcard";
	}
}
