package org.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Task_S2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://accounts.snapchat.com/accounts/login?continue=%2Faccounts%2Fwelcome");

		System.out.println(driver.getTitle());

		String s = driver.getCurrentUrl();

		System.out.println(s);

		driver.get("https://www.instagram.com/");

		driver.navigate().back();

		WebElement d = driver.findElement(By.name("username"));
		d.sendKeys("priyankagreens@gmail.com");

		driver.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(1000);

		driver.findElement(By.id("loginTrigger")).click();
		Thread.sleep(1000);

		driver.get("https://www.instagram.com/");

		driver.get("https://www.facebook.com/");

		driver.navigate().back();

		System.out.println(driver.getTitle());

		String s1 = driver.getCurrentUrl();
		System.out.println(s1);

		driver.navigate().forward();

		driver.findElement(By.name("email")).sendKeys("priyankagreens@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234");

		driver.findElement(By.name("pass")).clear();

		boolean b = driver.findElement(By.name("pass")).isEnabled();
		System.out.println(b);

		driver.findElement(By.name("email")).clear();
		boolean b1 = driver.findElement(By.name("pass")).isDisplayed();
		System.out.println(b1);

		driver.findElement(By.name("email")).sendKeys("priyankagreens@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234");

		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);

		driver.navigate().to("https://www.youtube.com");
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Screenshot\\youtube2.png");
		Files.copy(sr,f);
		

		driver.close();
	}
}
