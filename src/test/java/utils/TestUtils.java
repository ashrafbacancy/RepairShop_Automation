package utils;

import java.util.Date;

public class TestUtils {

	
	
	
	public static String getUniqueEmail() {
		return "Test" + System.currentTimeMillis() + "@repairShop.com";
	}

	
	
	public static String getUsernameFromEmail(String text) {
		String[] s = text.split("@");
		return s[0];
	}
	
	
	public static String uniqueTextGenerator(String text) {

		Date current = new Date();
		long unique = current.getTime();
		text = text +" "+ Long.toString(unique);
		return text;
	}
}
