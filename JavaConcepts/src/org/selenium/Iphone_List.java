package org.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Iphone_List {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\Programs\\browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		driver.get(
				"https://www.flipkart.com/?s_kwcid=AL!739!3!461541748727!p!!g!!flipcart%20com&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_city_nc_goog&gclid=EAIaIQobChMI44Dn87-2-QIVep1LBR0SLQ73EAAYASAAEgLCn_D_BwE");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_ESCAPE);
		a.keyRelease(KeyEvent.VK_ESCAPE);
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@name='q']"));
		name.sendKeys("iphone");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		
//		String allp = "//div[contains(text(),'iPhone')]";
//		List<WebElement> allproduct = driver.findElements(By.xpath("//div[contains(text(),'iPhone')]"));
		
		Thread.sleep(5000);
		
//		js.executeScript("arguments[0].value= 'iphone'", name);
		
//		WebElement mulpages = driver.findElement(By.xpath("//a[@text()='1']"));
//		
//		js.executeScript("arguments[0].scrollIntoView();", mulpages);
//		[class='_4rR01T']
		
		List<WebElement> product = driver.findElements(By.xpath("//div[contains(@class,'lrtEPN')]"));
		Thread.sleep(3000);
		
		for (WebElement webElement : product) {
			
			System.out.println(webElement.getText());

		}
		
			
	}

	
	
}
