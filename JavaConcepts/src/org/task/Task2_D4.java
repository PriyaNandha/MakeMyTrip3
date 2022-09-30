package org.task;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Task2_D4 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Priyanka day 4- task 2");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Priyanka");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Krishnamoorthy");
	
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("aaa,bbb,ccc");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("priyankagreens@gmail.com");
		
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);

		
		boolean b1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		System.out.println(b1);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		boolean b2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		System.out.println(b2);
		
		driver.findElement(By.id("firstpassword")).sendKeys("123456");
		Thread.sleep(1000);

		
		driver.findElement(By.id("secondpassword")).sendKeys("123456");
		Thread.sleep(1000);

		
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot)driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Screenshot\\Day4Task2.png");
		Files.copy(sr, f);
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		driver.findElement(By.xpath("//button[@id='Button1']")).click();
		Thread.sleep(3000);
		
		driver.close();
	
	}

}
