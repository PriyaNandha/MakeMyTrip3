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

public class Task3_D4 {

	public static void main(String[] args) throws Exception {

		System.out.println("Priyanka's Task");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Priyanka");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Krishnamoorthy");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("priyankagreens@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("123456789");
		
		driver.findElement(By.id("subjectsInput")).sendKeys("Testing");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//label[text()='Reading']")).click();
//		
		
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("aaa,bbb,ccc");
	
		Thread.sleep(3000);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sr =ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Screenshot\\Day4Task3.png");
		Files.copy(sr, f);
		
		driver.close();
		
		
		
	}

}
