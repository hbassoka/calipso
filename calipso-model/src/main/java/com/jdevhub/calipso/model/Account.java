package com.jdevhub.calipso.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="account" )
public class Account {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
	private Long id;
	
	 @Column(name = "account_number", length = 20, unique = true)
	private String number;
	
	@Column(name = "balance", precision = 10, scale = 2)
    private BigDecimal balance = BigDecimal.valueOf(0.00);
		
	@Column(name = "created_at", updatable = false)
	private LocalDateTime  creationDate=LocalDateTime.now();
		
	@ManyToOne
    @JoinColumn(name = "customer_id")
	private Customer customer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Long id, String number, BigDecimal balance, LocalDateTime creationDate, Customer customer) {
		super();
		this.id = id;
		this.number = number;
		this.balance = balance;
		this.creationDate = creationDate;
		this.customer = customer;
	}
	
	
	
}
