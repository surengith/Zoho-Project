package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {

	public WebDriver driver;

	public Signin_Page(WebDriver Signindriver) {
		this.driver = Signindriver;
		PageFactory.initElements(Signindriver, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getSigninemail() {
		return signinemail;
	}

	public WebElement getNextbutton() {
		return nextbutton;
	}

	@FindBy(linkText = "Sign in")
	private WebElement signin;

	@FindBy(name = "LOGIN_ID")
	private WebElement signinemail;

	@FindBy(id = "nextbtn")
	private WebElement nextbutton;

}
