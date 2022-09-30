package com.ticketbooking.airasia.AirAsia;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ticket {

	public static WebDriver driver;
	public static void select_Route() throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browser\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.airasia.co.in/home");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		WebElement fromPlace= driver.findElement(By.xpath("//div[@class='flight-search-source-field']/div[1]"));
		fromPlace.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Chennai'", fromPlace);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='list-item']")).click();
		Thread.sleep(2000);
		
		WebElement destination= driver.findElement(By.xpath("//div[@class='flight-search-source-field']/div[3]//input[@id='basic-url']"));
		js.executeScript("arguments[0].value='New delhi'", destination);
		Thread.sleep(2000);
		
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
		
		driver.findElement(By.xpath("//div[@class='flight-search-guest-details-icon-wrapper']")).click();
		
		WebElement passenger = driver.findElement(By.xpath("//span[text()='Senior Citizen']/ancestor::div[1]/following-sibling::div/img[@alt='plus']"));
		passenger.click();
		
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		driver.findElement(By.xpath("//div[@class='flight-search-widget-content-div display-flex-toggle']//descendant::img[@alt='select']")).click();
		
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		
		
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		select_Route();
	}

}
