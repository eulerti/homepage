package com.de.dev.homepage.web.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.de.dev.homepage.db.AboutHp;

@ManagedBean(name="about_hp")
@SessionScoped
public class AboutHpBean {
	private String fullText;
	
	@PostConstruct
	public void init() {
		this.printText();
	}
	
	public void printText() {
		AboutHp about = new AboutHp();
		fullText = about.getGrund() + about.getArt() + about.getJsf()
			+ about.getPf() + about.getCss();
		this.setFullText(fullText);
	}

	public String getFullText() {
		return fullText;
	}

	public void setFullText(String fullText) {
		this.fullText = fullText;
	}
}
