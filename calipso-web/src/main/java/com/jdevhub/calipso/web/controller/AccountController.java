package com.jdevhub.calipso.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.jdevhub.calipso.dto.AccountDto;
import com.jdevhub.calipso.ejb.AccountEJB;
import com.jdevhub.calipso.ejb.CustomerEJB;
import com.jdevhub.calipso.web.bean.AccountBean;
import com.jdevhub.calipso.web.bean.CustomerBean;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
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
    
    
    @EJB
    private AccountEJB accountEJB;
    
    
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
		 
		 List<AccountDto> listAccounts=accountEJB.findAll();
		 
		 
		 for( AccountDto item : listAccounts) {
			 
			 if(item.customer()!=null)
			 this.accounts.add(new AccountBean(item.id(),item.number(),item.balance(),item.creationDate(),
					 new CustomerBean(item.customer().id(),
							 item.customer().firstname(),
							 item.customer().lastname(),
							 item.customer().email(),
							 item.customer().creationDate()							 
				)
					 
			));
		 }
		 
	 }
    
	   // Préparer l'ajout
	    public String prepareView(AccountBean account) {
	    	this.selectedAccount = account;
	        this.dialogTitle = "Afficher un compte";
	        
	        return "view";
	    }
	    // Préparer l'ajout
	    public String prepareCreate() {
	    	this.selectedAccount = new AccountBean();
	    	this.dialogTitle = "Nouveau compte";
	    	
	    	return "add";
	    }

	 // Préparer l'édition
	    public String prepareEdit(AccountBean account) {
	        this.selectedAccount = account;
	        this.dialogTitle = "Modifier un  account";
	        return "edit";
	    }
	    
	 // Enregistrer ou mettre à jour
	    public String saveAccount() {
	    	
	        if (!accounts.contains(selectedAccount)) {
	        		        		        	
	            this.selectedAccount.setId(this.accounts.size()+1); // ID simple auto-incrément
	            
	            this.accounts.add(this.selectedAccount);
	        }
	        
	        return "list?faces-redirect=true";
	    }

	    // Supprimer
	    public void deleteAccount(AccountBean account) {
	    	this.accounts.remove(account);
	    }

}
