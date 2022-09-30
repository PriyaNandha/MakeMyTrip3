package com.home.zoho;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HomePage {
	
	public static WebDriver driver;
	
	public static void home_Page() throws InterruptedException, WebDriverException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browser\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zoho.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='main-container-wrapper']//descendant::a[text()='Free Sign Up']")).click();
		
		driver.findElement(By.xpath("//div[@class='signup-box']//descendant::input[@type='email']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//div[@class='signup-box']//descendant::input[@type='password']")).sendKeys("abcgthujt");
		Thread.sleep(5000);
		
		WebElement agreeCheckBox= driver.findElement(By.xpath("//div[@class='signup-box']//descendant::span[@class='unchecked']"));
		agreeCheckBox.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		Date dt = new Date();
		String date = dt.toString().replaceAll(":", "-")+ ".png";
		Files.copy(ts.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Screenshot"+ "zoho" +date));
		
		
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		home_Page();
	}

}
