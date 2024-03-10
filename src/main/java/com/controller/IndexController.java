package com.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	private static final Logger log = Logger.getLogger(IndexController.class.getName());
	@RequestMapping(value = "/hello.do", method = RequestMethod.GET)
	public String helloWorld(Model model) {
		 
		log.info("hello");
		
	    return "main";
	}
}
