package com.de.dev.homepage.db;

import com.de.dev.homepage.utils.Consts;
import com.de.dev.homepage.web.beans.AboutMeBean;;

public class AboutMe {
	AboutMeBean about = new AboutMeBean();

	private final String einleitung = "Mein Name ist " + Consts.getAuthor() + " und ich möchte mich"
		+ " über diese Homepage etwas näher vorstellen.\n";
	private final String aktuell = "Ich bin " + AboutMeBean.generateAge() + " Jahre alt, komme aus " + Consts.getTown()
		+ " (Raum Darmstadt) und mache derzeit eine Ausbildung als Fachinformatiker für Anwendungsentwicklung"
		+ " bei der Deutschen Telekom AG.\n";
	private final String vergangenheit = "Zuvor habe ich mein Fachabitur, im Bereich Wirtschaftsinformatik,"
		+ " an der Landrat-Gruber-Schule in Dieburg absolviert.\n";
	private final String job = "Binnen Januar 2017 werde ich vorraussichtlich meine Ausbildung abgeschlossen"
		+ " haben und bin auf der Suche nach einem Nachwuchskraft-Arbeitsplatz als Entwickler im Java Bereich.\n";
	private final String link = "Im folgenden Dokument erhalten Sie Einsicht in meinen Lebenslauf und über das"
		+ " unter meinem Profilbild stehendem Logo gelangen Sie zu meinem Xing-Profil.\n";
	private final String kontakt = "Über eine Kontaktaufnahme würde ich mich sehr freuen.";
	
	public String getEinleitung() {
		return einleitung;
	}
	
	public String getAktuell() {
		return aktuell;
	}
	
	public String getVergangenheit() {
		return vergangenheit;
	}
	
	public String getJob() {
		return job;
	}
	
	public String getLink() {
		return link;
	}
	
	public String getKontakt() {
		return kontakt;
	}
}
