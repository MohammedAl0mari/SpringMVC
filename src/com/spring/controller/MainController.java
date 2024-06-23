package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

	@RequestMapping("/")
	public String main() {
		return "mainpage";
	}
	@RequestMapping("/profile")
	//http://localhost:9090/spring-mvc/profile
	public String myPro() {
		return "myprofile";
	}
	
	@RequestMapping("/signin")
	// http://localhost:9090/spring-mvc/signin
	public String myLogin() {
		return "login";
	}
	
//	@RequestMapping("/loginprocess")
//	// http://localhost:9090/spring-mvc/loginprocess
//	public String formProcess(HttpServletRequest request , Model model) {
//		
//		String username = request.getParameter("user");
//		String password = request.getParameter("pass");
//		
//		String newName = username.toUpperCase();
//		String newPass = password.toLowerCase();
//		
//		model.addAttribute("toPageUser",newName);
//		model.addAttribute("toPagePass",newPass);
//		return "main";
//	}
	
	@RequestMapping("/loginprocess")
	// http://localhost:9090/spring-mvc/loginprocess
	public String formProcess(@RequestParam("user") String username,
			@RequestParam("pass") String password
			, Model model) {
		
		
		
		String newName = username.toLowerCase();
		String newPass = password.toLowerCase();
		
		model.addAttribute("toPageUser",newName);
		model.addAttribute("toPagePass",newPass);
		return "main";
	}
}
