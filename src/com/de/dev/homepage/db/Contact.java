package com.de.dev.homepage.db;

public class Contact {
	private final String fragen = "Sollten Sie Fragen bez�glich meiner Person, meiner Homepage oder"
		+ " Sonstigem haben freue ich mich Ihnen diese beantworten zu d�rfen.\n";
	private final String pflicht = "Die mit einem Sternchen (*) gekennzeichneten Felder sind Pflichtangaben.";
	
	public String getFragen() {
		return fragen;
	}
	public String getPflicht() {
		return pflicht;
	}
}
