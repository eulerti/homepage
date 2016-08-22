package com.de.dev.homepage.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.annotation.PostConstruct;

import com.de.dev.homepage.db.Contact;

@ManagedBean(name="contact")
@SessionScoped
public class ContactBean {
	private String fullText;
	
	@PostConstruct
	public void init() {
		this.printText();
	}
	
	public void printText() {
		Contact contact = new Contact();
		fullText = contact.getFragen() + contact.getPflicht();
		this.setFullText(fullText);
	}

	public String getFullText() {
		return fullText;
	}

	public void setFullText(String fullText) {
		this.fullText = fullText;
	}
}