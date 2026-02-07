package com.jdevhub.calipso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Account {

	@Id 
	@GeneratedValue
	@Column(name = "account_id")
	private Long id;
}
