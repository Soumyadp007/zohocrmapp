package com.zohoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohoApp.dto.Email;
import com.zohoApp.util.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailService;
	@RequestMapping("/sendEmail")
	public String mailMessage(@RequestParam("email") String email, ModelMap modelMap) {
		modelMap.addAttribute("email", email);
		return "conpose_email";
	}
	@RequestMapping("/treggerEmail")
	public String treggerEmail(Email email, ModelMap modelMap) {
		emailService.sendEmail(email.getEmail(), email.getSub(), email.getMessage());
		modelMap.addAttribute("msg", "email send!");
		return "conpose_email";
	}
}
