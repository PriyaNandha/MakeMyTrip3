package com.home.adactin;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Create_Login {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void login() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Browsers\\chromedriver.exe");
		System.out.println("Mini project 1");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://adactinhotelapp.com/");

//		WebElement register = driver.findElement(By.xpath("//a[@href='Register.php']"));
//		register.click();
//
//		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//		js.executeScript("arguments[0].value='Priya128'", username);
//		
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		js.executeScript("arguments[0].value='Npriya128'", password);
//		
//		WebElement confirmpsd = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
//		js.executeScript("arguments[0].value='Npriya128'", confirmpsd);
//		
//		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		js.executeScript("arguments[0].value='Priyanka'", firstname);
//		
//		WebElement email = driver.findElement(By.xpath("//input[@name='email_add']"));
//		js.executeScript("arguments[0].value='priyankacse913@gmail.com'", email);
//		
//		Thread.sleep(5000);
//		
//		WebElement term = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		term.click();
//		
//		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
//		submit.click();

		WebElement username1 = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].value='Priya128'", username1);

		WebElement password1 = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].value='Npriya128'", password1);

		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.sendKeys(Keys.ENTER);
	}

}
