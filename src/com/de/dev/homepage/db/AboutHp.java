package com.de.dev.homepage.db;

import com.de.dev.homepage.utils.Consts;

public class AboutHp {
	private final String grund = "Ich habe die Homepage " + Consts.getUrl()
		+ " als mein erstes Projekt erstellt um einerseits auf mich aufmerksam"
		+ " zu machen und andererseits um meine Webentwicklungskenntnisse zu verbessern.\n";
	private final String art = "Diese Homepage wurde mit Java Server Faces (JSF),"
		+ " dem Komponentenaufsatz Primefaces und der Stylesheet-Sprache CSS entwickelt.\n";
	private final String jsf = "JSF ist ein Framework-Standard für webbasierte grafische"
		+ " Benutzeroberflächen, welcher auf der Programmiersprache Java und der Metasprache"
		+ " HTML basiert.\n";
	private final String pf = "Primefaces ist eine Open Source Komponentenbibliothek,"
		+ " welche auf JSF-Applikationen basiert.\n";
	private final String css = "CSS ist eine Formatierungssprache mit der man HTML"
		+ " Layouts, welche hier durch Primefaces definiert werden, verändern kann.";
	
	public String getGrund() {
		return grund;
	}
	
	public String getArt() {
		return art;
	}
	
	public String getJsf() {
		return jsf;
	}
	
	public String getPf() {
		return pf;
	}
	
	public String getCss() {
		return css;
	}
}
