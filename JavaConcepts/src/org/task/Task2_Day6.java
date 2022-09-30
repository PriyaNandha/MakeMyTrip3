package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_Day6 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\SecondProject\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Form");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//input[@type='reset']")).click();
		
		driver.close();
	}

}
