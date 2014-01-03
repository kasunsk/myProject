package com.codetutr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class SampleController {
	
	private static final Logger log = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("home")
	public String loadHomePage(Model m) {
		log.info("Entered to the loadHomePage method in SampleController ");
		m.addAttribute("name", "CodeTutr");
		return "home";
	}

}
