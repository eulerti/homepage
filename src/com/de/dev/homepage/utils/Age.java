package com.de.dev.homepage.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import com.de.dev.homepage.utils.Consts;

public class Age {
	private static int age;
	static Date birth;
	static SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
	
	@SuppressWarnings("static-access")
	public static void recalcAge() throws Exception {
		GregorianCalendar cal = new GregorianCalendar();
		int y, d;
			setBirthDate(Consts.getDate());
				y = cal.get(cal.YEAR);
				d = cal.get(cal.DAY_OF_YEAR);
			cal.setTime(birth);
			age = y - cal.get(cal.YEAR);
		if (d < cal.get(cal.DAY_OF_YEAR)) {
			--age;
		}
		setAge(age);
	}
			
	private static void setBirthDate (Date birth) {
		Age.birth = birth;
	}
	
	private static void setBirthDate (String birth) throws Exception {
		setBirthDate(sdf.parse(birth));
	}
	
	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Age.age = age;
	}
}
