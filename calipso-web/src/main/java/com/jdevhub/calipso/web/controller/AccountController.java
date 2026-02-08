package com.jdevhub.calipso.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.jdevhub.calipso.web.bean.AccountBean;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class AccountController implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<AccountBean> accounts;
	
    private AccountBean selectedAccount;
    
    private String dialogTitle;
    
	public List<AccountBean> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<AccountBean> accounts) {
		this.accounts = accounts;
	}
	public AccountBean getSelectedAccount() {
		return selectedAccount;
	}
	public void setSelectedAccount(AccountBean selectedAccount) {
		this.selectedAccount = selectedAccount;
	}
	public String getDialogTitle() {
		return dialogTitle;
	}
	public void setDialogTitle(String dialogTitle) {
		this.dialogTitle = dialogTitle;
	}
    
    
	 @PostConstruct
	 public void init() {
		 
		 this.accounts=new ArrayList<>();
	 }
    
    
}
