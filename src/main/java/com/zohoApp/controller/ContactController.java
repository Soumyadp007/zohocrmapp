package com.zohoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohoApp.entity.Bill;
import com.zohoApp.entity.Contact;
import com.zohoApp.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	@RequestMapping("/listAllContact")
	public String ListAllContact(ModelMap modelMap) {
		List<Contact> contacts = contactService.listAllContact();
		modelMap.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	@RequestMapping("/contactInfo")
	public String findContactById(@RequestParam("id") long id, ModelMap modelMap) {
		Contact contact = contactService.findById(id);
		modelMap.addAttribute("contact", contact);
		return "contact_info";
	}
	@RequestMapping("/viewBill")
	public String viewBill(@RequestParam("id") long id, ModelMap modelMap) {
		Contact contact = contactService.findById(id);
		modelMap.addAttribute("contact", contact);
		return "generateBill";
	}
	
}
