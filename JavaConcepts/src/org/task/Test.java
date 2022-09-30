package org.task;

import javax.swing.text.Position;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.SetWindowPosition;

public class Test {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Browsers\\chromedriver.exe");

		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		
		driver.navigate().to("https://www.amazon.com/");
	
		System.out.println(driver.manage().window().getSize());
		
		System.out.println(driver.manage().window().getPosition());
		
		Dimension d= new Dimension(1500, 1000);
		driver.manage().window().setSize(d);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Browsers\\chromedriver.exe");

//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://demoqa.com/automation-practice-form");
//
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("input[type='text']")).sendKeys("Priyanka");
//		
		
		
	
	}

}
