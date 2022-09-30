package com.practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void sub_Method() throws AWTException  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Robot r = new Robot();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		String id = driver.getWindowHandle();
		
		System.out.println("Id : " + id);
		
//		driver.switchTo().window(id);
		
		System.out.println("title : " + driver.getTitle());

		for (int i = 1; i <= 2; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
		}
		
//		Set<String> 
		
//		driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]/preceding-sibling::a"));
	}

	public static void main(String[] args) throws AWTException   {
		
		sub_Method();
	}
}
