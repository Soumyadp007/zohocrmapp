package com.zohoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoApp.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
