package com.home.amazon;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.project.M_ProjectClass.XLSXReader;

public class Search {

	public static WebDriver driver;
	public static JavascriptExecutor js;

	public static void sub_Method() throws InterruptedException, InvalidFormatException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String expectedDropDownValue = XLSXReader.particularData("Project", 0, 1);
		String expectedInput = XLSXReader.particularData("Project", 0, 2);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(dropdown).perform();
		a.click().perform();
		
		Select opt1 = new Select(dropdown);
		List<WebElement> options = opt1.getOptions();
		
		
		for (int i = 0; i < options.size(); i++) {
			
			String acutalValue= options.get(i).getText();
			
			if (expectedDropDownValue.equalsIgnoreCase(acutalValue)) {
				
				opt1.selectByVisibleText(acutalValue);
			}
			
		}
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(expectedInput);

		Thread.sleep(5000);

		List<WebElement> toylist = driver.findElements(By.xpath("//div[@role='button']"));

		System.out.println(toylist.size());
		
		for (int i = 1; i <= toylist.size(); i++) {
			
			WebElement select = driver
					.findElement(By.xpath("//div[@class='autocomplete-results-container']/child::div[" + i + "]"));

			Thread.sleep(5000);
			if (select.getText().equalsIgnoreCase(expectedInput)) {

				select.click();
				break;
			}
			else {
				continue;
			}
		}
		
		
		Thread.sleep(2000);
		List<WebElement> resultsList = driver
				.findElements(By.xpath("//div[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div//h2"));
		Thread.sleep(2000);
		System.out.println(resultsList.size());
		List<WebElement> results = driver.findElements(
				By.xpath("//body/div/child::div[@id='search']/descendant::span[contains(text(),'RESULTS')]"));
		
		for (int i = 1; i <= resultsList.size(); i++) {

			WebElement result = driver.findElement(By.xpath("//div[@id='search']/descendant::h2[" + i + "]"));
			String itemUnderResult = result.getText();
//			System.out.println(itemUnderResult);
			Thread.sleep(2000);

		}
		// span[text()='RESULTS']
		// div[@id='search']/child::div[1]/div/div/span[3]/div[2]/div[2]//span
	}

	public static void main(String[] args) throws InterruptedException, InvalidFormatException, IOException {

		sub_Method();
	}

}
