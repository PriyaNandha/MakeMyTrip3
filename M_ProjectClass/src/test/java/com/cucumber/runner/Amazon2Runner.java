package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.general.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature\\cucumber.feature",
	glue = "com.cucumber.stepdef"
		
		)
public class Amazon2Runner {

	public static WebDriver driver = null;
	@BeforeClass
	public static void setUp() {

		driver= BaseClass.browserLaunch("chrome");
	}
	
	@AfterClass
	public static void tearDown() {
		
		BaseClass.browserClose();
		
	}

}
