package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_Day6 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\SecondProject\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//ytd-searchbox[@id='search']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(4000);

		
		driver.close();
		
	}

}
