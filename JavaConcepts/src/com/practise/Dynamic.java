package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id='desktop-grid-2']/preceding-sibling::div/child::div/child::div[3]")).click();

		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id='desktop-grid-2']/following-sibling::div[4]/child::div/child::div[3]")).click();

		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"(//html//body//div//div//div//div//div//div//div//div//div//a//div//img[@class='landscape-image'])[13]")).click();
		
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='desktop-grid-3']/descendant::div[2]/child::h2")).click();
		
		driver.navigate().back();
	}

}
