package com.Step_Definition.org;

import org.openqa.selenium.WebDriver;
import com.Base_Class.org.Base_Class;
import com.Page_Object_Manager.org.Page_Object_Manager;
import com.Property.org.File_Reader_Manager;
import com.Test_Runner.org.Test_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
	}

	@When("^user Click The Signin Button$")
	public void user_Click_The_Signin_Button() throws Throwable {
		clickOnElement(pom.getSip().getSignin());
	}

	@When("^user Enter The Email In The Signin Email Field$")
	public void user_Enter_The_Email_In_The_Signin_Email_Field() throws Throwable {
		String signin_Email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getSignin_Email();
		passInput(pom.getSip().getSigninemail(), signin_Email);
	}

	@When("^user Click The Next Button$")
	public void user_Click_The_Next_Button() throws Throwable {
		clickOnElement(pom.getSip().getNextbutton());
		wait(3000);
	}

	@When("^user TakeScreenShot Of The Signin Functionality$")
	public void user_TakeScreenShot_Of_The_Signin_Functionality() throws Throwable {
		screenshot("Signin_Page");
	}

	@Then("^user Click The SignUp Now Button And It Will Navigate To SignUp Page$")
	public void user_Click_The_SignUp_Now_Button_And_It_Will_Navigate_To_SignUp_Page() throws Throwable {
		clickOnElement(pom.getSup().getSignup());
	}

	@When("^user Enter The Email In The SignUp Email Field$")
	public void user_Enter_The_Email_In_The_SignUp_Email_Field() throws Throwable {
		String signup_Email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getSignup_Email();
		passInput(pom.getSup().getSignupemail(), signup_Email);
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		String passowrd = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassowrd();
		passInput(pom.getSup().getPassword(), passowrd);
	}

	@When("^user Enter The PhoneNumber In The PhoneNumber Field$")
	public void user_Enter_The_PhoneNumber_In_The_PhoneNumber_Field() throws Throwable {
		String phNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPhNumber();
		passInput(pom.getSup().getPhnumber(), phNumber);
	}

	@When("^user Click The SignUp For Free Button$")
	public void user_Click_The_SignUp_For_Free_Button() throws Throwable {
		clickOnElement(pom.getSup().getSubmit());
		wait(3000);
	}

	@Then("^user TakeScreenShot Of The Signup Functionality$")
	public void user_TakeScreenShot_Of_The_Signup_Functionality() throws Throwable {
		screenshot("Signup_Page");
	}

}
