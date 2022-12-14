package com.Test_Runner.org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Base_Class.org.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature_File\\org", glue = "com.Step_Definition.org",
dryRun = true, plugin = { "html:Report/Zoho_Report.html", "pretty", "json:Report/Zoho.json" })
public class Test_Runner {

	public static WebDriver driver;

	@BeforeMethod
	@BeforeClass
	public static void setUp() {
		driver = Base_Class.launchBrowser("Chrome");
	}

	@AfterMethod
	@AfterClass
	public static void tearDown() {
		Base_Class.closeBrowser();
	}
}
