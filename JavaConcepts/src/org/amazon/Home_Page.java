package org.amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home_Page {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void home() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Browsers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		

		Robot r = new Robot();
		
		
		WebElement tab1scr = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		WebElement tab1des = driver.findElement(By.xpath(""));
		
		Actions a = new Actions(driver);
		a.clickAndHold(tab1scr).moveToElement(tab1des).build().perform();
		
		
		
		
		

	}
	
	public static void main(String[] args) throws Exception {
		
		home();
		
	}

}
