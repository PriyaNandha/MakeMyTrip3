package org.selenium;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_3 {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions a;
	public static Robot r;

	public static void sub_Method() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Practise\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://psyarxiv.com/");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("sortBy")).click();
		Thread.sleep(5000);
		
		 WebElement opt= driver.findElement(By.xpath("//button[contains(text(),'Modified')]"));
		a.moveToElement(opt).click().build().perform();
		
		
		

	}

	public static void main(String[] args) throws Exception {
		sub_Method();
	}
	
	
}
