package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value="/welcome.do", method=RequestMethod.GET)
	public String welcome(Model model) {
		return "welcome";
	}
	
	@RequestMapping("/dest.do")
	public String dest(Model model) {
		return "dest";
	}
}
