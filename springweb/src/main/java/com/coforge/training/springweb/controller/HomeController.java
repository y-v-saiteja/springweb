package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/myHome", method = RequestMethod.GET)
    public String showHome(ModelMap model) {
       model.addAttribute("user", "Prateek");
       model.addAttribute("d", new java.util.Date());
           return "Home";  // return model + view name
       }
	
	@RequestMapping("/hello")
	public String showHello() {
		
		return "second"; //returns view name
		
	}
	
	

}
