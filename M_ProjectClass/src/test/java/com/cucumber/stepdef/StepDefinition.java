package com.cucumber.stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.general.BaseClass;
import com.cucumber.runner.Amazon2Runner;
import com.pom.SearchItemPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition  extends BaseClass{

	public static WebDriver driver = Amazon2Runner.driver;
	SearchItemPom sip = new SearchItemPom(driver);	
	
	@Given("user Lauch The Application Url")
	public void user_lauch_the_application_url() {
		
		launchUrl("https://www.amazon.com/");
	}
	
	@When("user Close The Popup Box")
	public void user_close_the_popup_box() throws AWTException {
		
		escapeKey();
	
	}
	
	
	@When("user Enter The Product In Searchbox")
	public void user_enter_the_product_in_searchbox() {
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13");
		
		WebElement searchText = sip.getSearchText();
		userInput(searchText, "iphone 13");
		
	}
	@Then("user Click The Search Icon")
	public void user_click_the_search_icon() {
		

//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement submit = sip.submit();
		clickOnWebelement(submit);
	}

	
	

}
