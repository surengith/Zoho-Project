package com.Runner.org;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Base_Class.org.Base_Class;
import com.Page_Object_Manager.org.Page_Object_Manager;
import com.Pom.org.Signin_Page;
import com.Pom.org.Signup_Page;
import com.Property.org.File_Reader_Manager;

public class Runner extends Base_Class {

	public static WebDriver driver = launchBrowser("Chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

//		launchBrowser("Chrome");

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);

//		Signin_Page sip = new Signin_Page(driver);

		// Signin Page

//		WebElement signin = driver.findElement(By.linkText("Sign in"));
//		signin.click();
		clickOnElement(pom.getSip().getSignin());

//		WebElement signinemail = driver.findElement(By.name("LOGIN_ID"));
//		signinemail.sendKeys("surendhar123@gmail.com");
		String signin_Email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getSignin_Email();
		passInput(pom.getSip().getSigninemail(), signin_Email);

//		WebElement nextbutton = driver.findElement(By.id("nextbtn"));
//		nextbutton.click();
		clickOnElement(pom.getSip().getNextbutton());
		wait(3000);
		screenshot("Signin_Page");

//		Signup_Page sup = new Signup_Page(driver);

		// Signup Page
//		WebElement signup = driver.findElement(By.linkText("Sign Up Now"));
//		signup.click();
		clickOnElement(pom.getSup().getSignup());

//		WebElement signupemail = driver.findElement(By.xpath("//input[@type='email']"));
//		signupemail.sendKeys("abc@gmail.com");
		String signup_Email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getSignup_Email();
		passInput(pom.getSup().getSignupemail(), signup_Email);

//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("123456");
		String passowrd = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassowrd();
		passInput(pom.getSup().getPassword(), passowrd);

//		WebElement phnumber = driver.findElement(By.id("rmobile"));
//		phnumber.sendKeys("987654321");
		String phNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPhNumber();
		passInput(pom.getSup().getPhnumber(), phNumber);

//		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
//		submit.click();
		clickOnElement(pom.getSup().getSubmit());
		wait(3000);
		screenshot("Signup_Page");
		closeBrowser();
	}

}
