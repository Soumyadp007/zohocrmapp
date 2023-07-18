package com.zohoApp.service;

import java.util.List;

import com.zohoApp.entity.Contact;

public interface ContactService {
	public void saveContact(Contact contact);

	public List<Contact> listAllContact();

	public Contact findById(long id);
}
