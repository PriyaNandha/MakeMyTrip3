package org.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementText;
import org.openqa.selenium.support.pagefactory.ByAll;

import com.google.common.io.Files;

public class Task1_D4 {


public static void main(String[] args) throws Exception {
	
	System.out.println("Priyanka day 4- task 1");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Chromedriver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement t1 = driver.findElement(By.xpath("//h2[contains(text(),'helps you')]"));
	String st= t1.getText();
	System.out.println(st);
	
	WebElement t2 = driver.findElement(By.name("email"));
	t2.sendKeys("priyankagreens@gmail.com");
	Thread.sleep(1000);
	
	WebElement t3= driver.findElement(By.name("pass"));
	t3.sendKeys("123456");
	Thread.sleep(1000);
	
	WebElement t4 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	t4.click();
	Thread.sleep(3000);

	 driver.findElement(By.name("firstname")).sendKeys("Priyanka"); Thread.sleep(1000);
	 
	 
	 driver.findElement(By.name("lastname")).sendKeys("Krishnamoorthy"); Thread.sleep(1000);
	 
	 WebElement t5= driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	 t5.sendKeys("123456789");
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("ABCDE");Thread.sleep(1000);
	 
	 boolean b= driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	 System.out.println(b);
	 
	 driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click(); Thread.sleep(1000);
	 
	 boolean b1= driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	 System.out.println(b1);
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	 
	 Thread.sleep(3000);
	 
	 TakesScreenshot ts= (TakesScreenshot)driver;
	 File sr = ts.getScreenshotAs(OutputType.FILE);
	 File f = new File("C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Screenshot\\Day4Task1.png");
	 Files.copy(sr, f);
	 
	 driver.close();
	 
	
}

}
