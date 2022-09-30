package org.selenium;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_2 {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions a;
	public static Robot r;

	public static void sub_Method() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Programs\\browser\\chromedriver.exe");
		
//		https://psyarxiv.com/
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in/");
		Thread.sleep(2000);
//		WebElement state = driver.findElement(By.xpath("(//span[contains(text(),'Select')])[1]"));
		
		js.executeScript("window.scrollBy(0,2000);");
		
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//		js.executeScript("arguments[0].scrollIntoView();", state);
//		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		sub_Method();
		
		
	}

}
