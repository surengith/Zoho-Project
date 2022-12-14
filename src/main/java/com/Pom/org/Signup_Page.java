package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_Page {

	public WebDriver driver;

	public Signup_Page(WebDriver Signupdriver) {
		this.driver = Signupdriver;
		PageFactory.initElements(Signupdriver, this);
	}

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getSignupemail() {
		return signupemail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getPhnumber() {
		return phnumber;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(linkText = "Sign Up Now")
	private WebElement signup;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement signupemail;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(id = "rmobile")
	private WebElement phnumber;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

}
