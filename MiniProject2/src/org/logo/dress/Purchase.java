package org.logo.dress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Purchase {


	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions a;
	

	public static void purchas() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browsers\\chromedriver.exe");
		
		System.out.println("Mini Project - 2");
		
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("priyankacse913@gmail.com");
//		js.executeScript("arguments[0].value='priyankacse913@gmail.com'", email);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("priya123");
//		js.executeScript("arguments[0].value='priya123'", password);

		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();

		WebDriverWait xwait = new WebDriverWait(driver, 50);
		xwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Women']")));

		WebElement dress = driver.findElement(By.xpath("//a[@title='Women']"));
		a = new Actions(driver);
		a.moveToElement(dress).perform();
		
		WebElement evendress= driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
		a.moveToElement(evendress).click().perform();
		
		
		

	}

	
}
