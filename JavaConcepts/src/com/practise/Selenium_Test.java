package com.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Test {

	public void sub_Method() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Browsers\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();
		
		driver.get("");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
