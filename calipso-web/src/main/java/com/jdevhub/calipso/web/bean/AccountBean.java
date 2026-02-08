package com.jdevhub.calipso.web.bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.persistence.Column;

@Named
@RequestScoped
public class AccountBean {

	private Integer id;
		
	private String number;
		
    private BigDecimal balance = BigDecimal.valueOf(0.00);
			
	private LocalDateTime  creationDate=LocalDateTime.now();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public AccountBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountBean(Integer id, String number, BigDecimal balance, LocalDateTime creationDate) {
		super();
		this.id = id;
		this.number = number;
		this.balance = balance;
		this.creationDate = creationDate;
	}
	
	
	
}
