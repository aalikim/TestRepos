package com.kosta.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kosta.dao.UserDAOImpl;
import com.kosta.dto.UserDTO;
import com.kosta.service.UserServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private UserServiceImpl service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/main.do")
	public ModelAndView main() {
		
		ModelAndView mav = new ModelAndView();
		
		List<UserDTO> userList = service.userList();
		
		mav.addObject("list", userList);
		mav.setViewName("main");		
		return mav;
	}

	@RequestMapping("update.do")
	public String update(@RequestParam String id, Model model) {
		model.addAttribute("id", id);
		return "update";
	}
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute UserDTO dto) {
		System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getPassword());
		service.insert(dto);
		return "redirect:main.do";
	}
	
	@RequestMapping("/delete")
	public String insert(@RequestParam String id) {
		System.out.println(id);
		service.delete(id);
		return "redirect:main.do";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute UserDTO dto) {
		System.out.println(dto.getId()+" "+dto.getName()+" "+dto.getPassword());
		service.update(dto);	
		return "redirect:main.do";
	}
}
