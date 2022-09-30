package org.project.M_ProjectClass;

import java.util.Date;
import java.util.List;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hotel_Reg extends Create_Login {
	
	public static void screenshot() throws Exception {
		Date d = new Date();
		String filename = d.toString().replace(':', '_')+".png";
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		Files.copy(screenshot.getScreenshotAs(OutputType.FILE),
					new File("C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Screenshot" + filename));
	}

	public static void hotel_reg() throws Exception {

		WebElement drop = driver.findElement(By.xpath("//select[@name='location']"));
		Select opt = new Select(drop);

		List<WebElement> li = opt.getOptions();

		for (int i = 0; i < li.size(); i++) {

			System.out.println(li.get(i).getText());
		}
		opt.selectByValue("London");

		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select opt1 = new Select(hotel);
		opt1.selectByValue("Hotel Sunshine");

		WebElement type = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select opt2 = new Select(type);
		opt2.selectByValue("Standard");

		WebElement num = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select opt3 = new Select(num);
		opt3.selectByValue("1");

		Thread.sleep(2000);
		
		WebElement chkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		chkin.clear();
		Thread.sleep(2000);
		chkin.sendKeys("28/08/2022");
//		js.executeScript("arguments[0].value='28/08/2022'", chkin);

		Thread.sleep(2000);

		WebElement chkout = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		chkout.clear();
		Thread.sleep(2000);
		chkout.sendKeys("30/08/2022");
//		js.executeScript("arguments[0].value='30/08/2022'", chkout);

		WebElement rom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select opt4 = new Select(rom);
		opt4.selectByValue("1");
		Thread.sleep(2000);

		WebElement chdrom = driver.findElement(By.xpath("//parent::tr//child::td//select[@name='child_room']"));
		Select opt5 = new Select(chdrom);
		opt5.selectByValue("1");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//parent::tr//child::td//input[@type='submit']"));
		search.click();
		Thread.sleep(2000);
		
		WebElement select = driver.findElement(By.xpath("//parent::tbody//child::tr//child::td//input[@type='radio']"));
		select.click();
		Thread.sleep(2000);
		
		WebElement con = driver.findElement(By.xpath("//parent::tbody//child::tr//child::td//input[@type='submit']"));
		con.click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("Priyanka");
		
		driver.findElement(By.xpath("(//input[@type='text'])[12]")).sendKeys("Krishnamoorthy");
		
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Newyork");
		
		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("1234567897254568");
		
		WebElement name = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select size1 = new Select(name);
		size1.selectByValue("VISA");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select size2 = new Select(month);
		size2.selectByValue("8");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select size3 = new Select(year);
		size3.selectByValue("2022");
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("56789");
		
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		
		
		
		
		
		
	}

	public static void main(String[] args) throws Exception {

		login();
		hotel_reg();

	}

}
