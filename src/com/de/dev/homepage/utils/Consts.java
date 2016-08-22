package com.de.dev.homepage.utils;

public class Consts {
	private static final String AUTHOR = "Timon Euler";
	private static final String TOWN = "Ober-Ramstadt";
	private static final String DATE = "05.06.1992";
	private static final String PROJECT = Consts.AUTHOR + "'s homepage";
	private static final String URL = "www.timon-euler.de";
	private static final String VERSION = "1.0";
	private static final String STATUS = "stable";
	private static final String SERVER = "Apache Tomcat 7";
	
	public static String getAuthor() {
		return AUTHOR;
	}
	
	public static String getTown() {
		return TOWN;
	}

	public static String getDate() {
		return DATE;
	}

	public static String getProject() {
		return PROJECT;
	}
	
	public static String getUrl() {
		return URL;
	}
	
	public static String getVersion() {
		return VERSION;
	}
	
	public static String getStatus() {
		return STATUS;
	}
	
	public static String getServer() {
		return SERVER;
	}	
}
