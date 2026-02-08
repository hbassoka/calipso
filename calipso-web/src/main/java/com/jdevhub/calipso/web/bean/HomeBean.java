package com.jdevhub.calipso.web.bean;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HomeBean {
	
	public String getMessage() {
        return "Bienvenue sur Calipso";
    }
}
