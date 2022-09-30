package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Day6 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\SecondProject\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(1000);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.xpath("//a[@href='/digest_auth']")).click();
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.xpath("//a[@href='/disappearing_elements']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@href='/']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@href='/disappearing_elements']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@href='/about/']")).click();
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.xpath("//a[@href='/contact-us/']")).click();
		Thread.sleep(1000);

		driver.navigate().back();

		driver.findElement(By.xpath("//a[@href='/portfolio/']")).click();
		Thread.sleep(1000);

		driver.navigate().back();

		driver.navigate().back();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@href='/dynamic_controls']")).click();
		Thread.sleep(1000);

		WebElement t1 = driver.findElement(By.xpath("//p[contains(text(),'This example')]"));
		String s = t1.getText();
		System.out.println(s);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.close();

	}

}
