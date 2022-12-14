package com.Page_Object_Manager.org;

import org.openqa.selenium.WebDriver;

import com.Pom.org.Signin_Page;
import com.Pom.org.Signup_Page;

public class Page_Object_Manager {

	public WebDriver driver;

	public Page_Object_Manager(WebDriver pomdriver) {
		this.driver = pomdriver;
	}

	public Signin_Page getSip() {
		sip = new Signin_Page(driver);
		return sip;
	}

	public Signup_Page getSup() {
		sup = new Signup_Page(driver);
		return sup;
	}

	private Signin_Page sip;

	private Signup_Page sup;

}
