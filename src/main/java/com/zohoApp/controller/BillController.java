package com.zohoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohoApp.entity.Bill;
import com.zohoApp.service.BillService;
@Controller
public class BillController {
	@Autowired
	private BillService billService;
	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute("bill") Bill bill, ModelMap modelMap) {
		billService.saveBill(bill);
		modelMap.addAttribute("bill", bill);
		return "savedBill";
	}
}
