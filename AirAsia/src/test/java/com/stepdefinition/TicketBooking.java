package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.airrunner.AirAAsiaRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TicketBooking {
	
	public static WebDriver driver = AirAAsiaRunner.driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("user Launch The Application Url")
	public void user_launch_the_application_url() {
		driver.get("https://www.airasia.co.in/home");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	@When("use Enter The From And Destination")
	public void use_enter_the_from_and_destination() throws InterruptedException {
		WebElement fromPlace= driver.findElement(By.xpath("//div[@class='flight-search-source-field']/div[1]"));
		fromPlace.click();
		
	
		js.executeScript("arguments[0].value='Chennai'", fromPlace);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='list-item']")).click();
		Thread.sleep(2000);
		
		WebElement destination= driver.findElement(By.xpath("//div[@class='flight-search-source-field']/div[3]//input[@id='basic-url']"));
		js.executeScript("arguments[0].value='New delhi'", destination);
		Thread.sleep(2000);
	}
	@When("user Select The Date")
	public void user_select_the_date() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='list-item']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='selected-date']")).click();
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//div[text()='Oct 2022']"));
		js.executeScript("arguments[0].scrollIntoView();", month);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Oct 2022']/ancestor::div[1]//div[text()='29']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Back']")).click();
		Thread.sleep(2000);
	}
	@When("use Select The Passenger Count And Click Accept")
	public void use_select_the_passenger_count_and_click_accept() {
		driver.findElement(By.xpath("//div[@class='flight-search-guest-details-icon-wrapper']")).click();
		
		WebElement passenger = driver.findElement(By.xpath("//span[text()='Senior Citizen']/ancestor::div[1]/following-sibling::div/img[@alt='plus']"));
		passenger.click();
		
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		
		driver.findElement(By.xpath("//div[@class='flight-search-widget-content-div display-flex-toggle']//descendant::img[@alt='select']")).click();
		
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
	}
	@Then("close The Application Url")
	public void close_the_application_url() {
		
	}



	

}
