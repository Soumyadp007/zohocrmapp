package com.zohoApp.service;

import java.util.List;

import com.zohoApp.entity.Lead;

public interface LeadService {
	public Lead saveLead(Lead lead);

	public Lead findById(long id);

	public void deleteById(long id);

	public List<Lead> ListAllLead();
}
