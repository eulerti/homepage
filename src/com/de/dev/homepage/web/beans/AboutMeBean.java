package com.de.dev.homepage.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.annotation.PostConstruct;

import com.de.dev.homepage.db.AboutMe;
import com.de.dev.homepage.utils.Age;

@ManagedBean(name="about_me")
@SessionScoped
public class AboutMeBean {
	private String fullText;
	private static int age;
	
	@PostConstruct
	public void init() {
		this.printText();
	}
	
	public void printText() {
		AboutMe about = new AboutMe();
		fullText = about.getEinleitung() + about.getAktuell() + about.getVergangenheit()
			+ about.getJob() + about.getLink() + about.getKontakt();
		this.setFullText(fullText);
	}
	
	public static int generateAge() {
		try {
			Age.recalcAge();
		} catch (Exception e) {
			e.printStackTrace();
		}
			age = Age.getAge();
		return age;
	}
	
	public String getFullText() {
		return fullText;
	}

	public void setFullText(String fullText) {
		this.fullText = fullText;
	}
}
