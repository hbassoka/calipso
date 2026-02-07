package com.jdevhub.calipso.web.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HomeBean {
	
	public String getMessage() {
        return "Bienvenue sur Calipso";
    }
}
