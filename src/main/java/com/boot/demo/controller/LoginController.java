package com.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping(value = { "/loginSuccess" })
	public String getHomePage(ModelMap modelMap) {
		modelMap.put("user", "logged in successfully");
		return "home";
	}

	@GetMapping(value = { "/loginError" })
	public String getErrorPage(ModelMap modelMap) {
		modelMap.put("user", "There was an error while validating. Can you please try again after some time");
		return "home";
	}
}
