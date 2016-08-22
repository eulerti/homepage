package com.de.dev.homepage.db;

import com.de.dev.homepage.utils.Consts;

public class Home {
	private final String begruesung = "Hallo, mein Name ist " + Consts.getAuthor()
		+ " und ich heiße Sie herzlich Willkommen auf meiner Homepage.\n";
	private final String homepage = "Diese Homepage beschäftigt sich mit deren"
		+ " Erstellung sowie meiner selbst.\n";
	private final String schlusswort = "Vielen Dank fürs Vorbeischauen!";
	
	public String getBegruesung() {
		return begruesung;
	}
	
	public String getHomepage() {
		return homepage;
	}
	
	public String getSchlusswort() {
		return schlusswort;
	}
}
