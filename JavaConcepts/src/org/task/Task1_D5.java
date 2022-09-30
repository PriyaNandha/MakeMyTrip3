package org.task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Task1_D5 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("Priyanka");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("12345");
		
		
		driver.findElement(By.id("login")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Screenshot\\Day5_T1.png");
		Files.copy(sr, f);
		
	
	}
}
