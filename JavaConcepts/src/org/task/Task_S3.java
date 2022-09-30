package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_S3 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("value")).sendKeys("priyankagreens@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement p = driver.findElement(By.name("password"));
		p.sendKeys("123456");
		
		Thread.sleep(3000);
		
		WebElement l = driver.findElement(By.name("submit"));
		l.click();
		
		
		Thread.sleep(3000);

		
	}
}
