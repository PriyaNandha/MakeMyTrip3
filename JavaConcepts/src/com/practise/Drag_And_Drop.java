package com.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Browsers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement l1 = driver.findElement(By.xpath("(//div[@class='column'])[1]"));
		WebElement l2 = driver.findElement(By.xpath("(//div[@class='column'])[2]"));

		Actions a = new Actions(driver);

//		a.dragAndDrop(l1, l2).build().perform();
		
		
//		a.moveToElement(l2).build().perform();
		
		a.clickAndHold(l1).moveToElement(l2).release(l2).build().perform();
		
		driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
		
		driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		
		
		
		
		
		

	}

}
