package org.task;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Send_Values {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		TakesScreenshot ts = (TakesScreenshot) driver;

		
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String timestamp = time.toString().replace(':', ' ');

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
		String timstamp = sdf.format(d);
		
		System.out.println(timestamp);
		System.out.println(timstamp);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);

//		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email"));

		WebElement searchtext = driver.findElement(By.xpath("//input[@type='text']"));
//		js.executeScript("document.getElementById('element id').value='priya'", searchtext);
		js.executeScript("arguments[0].value='priya';", searchtext);

		WebElement searchtext2 = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].value='1234';", searchtext2);
		Thread.sleep(2000);

		Files.copy(ts.getScreenshotAs(OutputType.FILE),
				new File("C:\\Users\\GOD\\eclipse-workspace\\Task\\Screenshot\\photo" + timstamp + ".png"));

		driver.get("https://www.google.com/");
		String title= driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File sr = ts.getScreenshotAs(OutputType.FILE);
//		File f = new File("C:\\Users\\GOD\\eclipse-workspace\\Selenium_Project\\Screenshot\\Day4Task2"+time+".png");
//		Files.copy(a, b);
//		Thread.sleep(1000);
			
		Files.copy(ts.getScreenshotAs(OutputType.FILE),
				new File("C:\\Users\\GOD\\eclipse-workspace\\Task\\Screenshot\\google" + timstamp + ".png"));

//		driver.quit();

	}

}
