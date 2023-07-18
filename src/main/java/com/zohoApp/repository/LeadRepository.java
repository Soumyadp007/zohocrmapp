package com.zohoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoApp.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long>{

}
