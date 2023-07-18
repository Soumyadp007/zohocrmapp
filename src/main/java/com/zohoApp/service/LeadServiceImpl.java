package com.zohoApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohoApp.entity.Lead;
import com.zohoApp.repository.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;
	@Override
	public Lead saveLead(Lead lead) {
		return leadRepo.save(lead);
	}
	@Override
	public Lead findById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
		
	}
	@Override
	public List<Lead> ListAllLead() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
