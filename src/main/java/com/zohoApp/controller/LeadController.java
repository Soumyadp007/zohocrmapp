package com.zohoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohoApp.entity.Contact;
import com.zohoApp.entity.Lead;
import com.zohoApp.service.ContactService;
import com.zohoApp.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	@Autowired
	private ContactService contactService;
	@RequestMapping("/createLead")
	public String CreateLead() {
		return "create_lead";
	}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Lead lead, ModelMap modelMap) {
		leadService.saveLead(lead);
		modelMap.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/convert")
	public String findLead(@RequestParam("id")long id, ModelMap modelMap) {
		Lead leads = leadService.findById(id);
		Contact contact = new Contact();
		contact.setId(leads.getId());
		contact.setFirstName(leads.getFirstName());
		contact.setLastName(leads.getLastName());
		contact.setEmail(leads.getEmail());
		contact.setMobile(leads.getMobile());
		contact.setSource(leads.getSource());
		contactService.saveContact(contact);
		leadService.deleteById(id);
		List<Contact> contacts = contactService.listAllContact();
		modelMap.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	@RequestMapping("/listAll")
	public String ListAllLead(ModelMap modelMap) {
		List<Lead> lead = leadService.ListAllLead();
		modelMap.addAttribute("lead", lead);
		return "list_all";
	}
	@RequestMapping("/leadInfo")
	public String findLeadById(@RequestParam("id") long id, ModelMap modelMap) {
		Lead lead = leadService.findById(id);
		modelMap.addAttribute("lead", lead);
		return "lead_info";
	}
}
