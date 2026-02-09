package com.jdevhub.calipso.web.controller;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.jdevhub.calipso.dto.CustomerDto;
import com.jdevhub.calipso.ejb.CustomerEJB;
import com.jdevhub.calipso.web.bean.AccountBean;
import com.jdevhub.calipso.web.bean.CustomerBean;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;


@Named
@SessionScoped
public class CustomerController implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<CustomerBean> customers;
    private CustomerBean selectedCustomer;
    private String dialogTitle;
    
    @EJB
    private CustomerEJB customerEJB;
    
    @PostConstruct
    public void init() {
        customers = new ArrayList<>();
        
        
        List<CustomerDto> listCustomers=customerEJB.findAll();
        
        for (CustomerDto customerDto : listCustomers) {
			
        	customers.add(new CustomerBean(customerDto.id(),customerDto.firstname(),customerDto.lastname(), customerDto.email(),LocalDateTime.now()));
        	
        	
		}
        
        
    }

    public List<CustomerBean> getCustomers() {
        return customers;
    }

    public CustomerBean getSelectedCustomer() {
        return selectedCustomer;
    }

    public void setSelectedCustomer(CustomerBean selectedCustomer) {
        this.selectedCustomer = selectedCustomer;
    }

    public String getDialogTitle() {
        return dialogTitle;
    }

    // Préparer l'ajout
    public void prepareCreate() {
    	this.selectedCustomer = new CustomerBean();
        this.dialogTitle = "Add Customer";
    }

    
 // Préparer l'ajout
    public void prepareView(CustomerBean customer) {
    	this.selectedCustomer = customer;
    	this.dialogTitle = "Afficher un client";
    }
    // Préparer l'édition
    public void prepareEdit(CustomerBean customer) {
    	this.selectedCustomer = customer;
    	this.dialogTitle = "Modification client";
    }

    // Enregistrer ou mettre à jour
    public void saveCustomer() {
    	
        if (!customers.contains(selectedCustomer)) {
        	
        	
        	
            selectedCustomer.setId(customers.size()+1); // ID simple auto-incrément
            
            customers.add(selectedCustomer);
        }
    }

    // Supprimer
    public void deleteCustomer(CustomerBean customer) {
    	this.customers.remove(customer);
    }
}
