package com.Property.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\Surendhar\\eclipse-workspace\\Maven_Zoho_Project\\src\\main\\java\\com\\Property\\org\\Zoho.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public static String getBrowser() {
		String browser = p.getProperty("Browser");
		return browser;
	}

	public static String getUrl() {
		String url = p.getProperty("Url");
		return url;
	}

	public static String getSignin_Email() {
		String Signin_Email = p.getProperty("Signin_Email");
		return Signin_Email;
	}

	public static String getSignup_Email() {
		String Signup_Email = p.getProperty("Signup_Email");
		return Signup_Email;
	}

	public static String getPassowrd() {
		String Passowrd = p.getProperty("Passowrd");
		return Passowrd;
	}

	public static String getPhNumber() {
		String PhNumber = p.getProperty("PhNumber");
		return PhNumber;
	}
}
