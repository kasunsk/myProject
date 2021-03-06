package com.codetutr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class SampleController {
	
	private static final Logger log = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("login")
	public String loadLoginPage(Model m) {
		log.info("Entered to the loadLoginPage method in SampleController ");
		m.addAttribute("name", "Kasun... U did it");
		return "login";
	}
	
	@RequestMapping("home")
	public String loadHomePage(Model m){
		log.info("Entered to the home in SampleController ");
		//m.addAttribute("name", "Kasun... U did it");
		return "home";
	}
	
	@RequestMapping("hello")
	public String loadHelloPage(Model m){
		log.info("Entered to the loadHelloPage method in SampleController ");
		
		return "hello";
	}
	

}
