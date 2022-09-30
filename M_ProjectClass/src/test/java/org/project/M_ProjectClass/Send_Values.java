package org.project.M_ProjectClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.eventusermodel.XSSFBReader;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Values {

	public static void main(String[] args) throws InvalidFormatException, IOException{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\M_ProjectClass\\Browser\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String vlaue = FileRead.file_Read(0, 2);   //.file_Read(0,3);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(vlaue);
		
		
	}

}
