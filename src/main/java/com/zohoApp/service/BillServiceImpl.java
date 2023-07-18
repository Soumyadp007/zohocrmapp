package com.zohoApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohoApp.entity.Bill;
import com.zohoApp.repository.BillRepository;
@Service
public class BillServiceImpl implements BillService {
	@Autowired
	private BillRepository billRepo;
	@Override
	public Bill saveBill(Bill bill) {
		return billRepo.save(bill);
	}

}
