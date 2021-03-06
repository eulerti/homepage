package com.de.dev.homepage.web.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.de.dev.homepage.db.Home;
import com.de.dev.homepage.utils.Age;

@ManagedBean(name="home")
@SessionScoped
public class HomeBean {
	private String fullText;
	private int age;
	
	@PostConstruct
	public void init() {
		this.printText();
		try {
			Age.recalcAge();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		age = Age.getAge();
	}
	
	public void printText() {
		Home home = new Home();
		setFullText(home.getBegruesung() + home.getHomepage() + home.getSchlusswort());
		this.setFullText(fullText);
	}

	public String getFullText() {
		return fullText;
	}

	public void setFullText(String fullText) {
		this.fullText = fullText;
	}

	public int getAge() {
		return age;
	}
}
