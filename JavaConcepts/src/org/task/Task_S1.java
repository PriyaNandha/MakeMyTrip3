package org.task;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class Task_S1 {

	public static void main(String[] args) throws Exception {

		System.out.println("Priyanka Day3 Task");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com");
		Thread.sleep(1000);

		driver.manage().window().maximize();

		String s = driver.getTitle();
		System.out.println(s);

		driver.navigate().to("https://www.snapchat.com/en-GB");

		String s1 = driver.getCurrentUrl();
		System.out.println(s1);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().to("https://www.youtube.com");
		Thread.sleep(1000);

		driver.navigate().back();

		String s2 = driver.getCurrentUrl();
		System.out.println(s2);

		String s3 = driver.getTitle();
		System.out.println(s3);

		driver.navigate().forward();
		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Screenshot\\youtube(time).png");
		Files.copy(f, d);

		driver.navigate().refresh();
		Thread.sleep(1000);

		driver.close();
		

	}

}
