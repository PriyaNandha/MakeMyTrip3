package com.home.cowin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HospitalList {

	public static WebDriver driver;

	public static void sub_Method() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in/");

		WebElement state = driver
				.findElement(By.xpath("//div[@class='page-wrapper']//descendant::span[text()='Select Your State']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", state);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", state);

		List<WebElement> stateList = driver.findElements(By.xpath("//span[@class='mat-option-text']"));

		for (WebElement states : stateList) {
			if (states.getText().trim().equalsIgnoreCase("Tamil Nadu")) {
				js.executeScript("arguments[0].click();", states);
				break;
			}
		}

		WebDriverWait xwait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		WebElement selectDistrict = driver.findElement(
				By.xpath("//div[@class='page-wrapper']//descendant::span[contains(text(),'Select District')]"));

//		xwait.until(ExpectedConditions.elementToBeClickable(selectDistrict));

		js.executeScript("arguments[0].click();", selectDistrict);

		List<WebElement> allDistricts = driver.findElements(By.xpath("//span[@class='mat-option-text']"));

		for (WebElement district : allDistricts) {
			if (district.getText().trim().equalsIgnoreCase("Chennai")) {
				js.executeScript("arguments[0].click();", district);
				break;
			}
		}
		WebElement search = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		js.executeScript("arguments[0].click();", search);

		List<WebElement> alldata = driver.findElements(By.xpath("//input[@type='checkbox']//parent::div"));
		xwait.until(ExpectedConditions.visibilityOfAllElements(alldata));

		for (WebElement data : alldata) {

			if (data.getText().trim().equalsIgnoreCase("18+")) { // "arguments[0].click();", element
				data.click();
//					js.executeScript("arguments[0].click();", data);
				System.out.println(data.getText());
//					Thread.sleep(2000);
			} else if (data.getText().trim().equalsIgnoreCase("Dose 2")) {
				data.click();
//					js.executeScript("arguments[0].click();", data);
				System.out.println(data.getText());
//					Thread.sleep(2000);
			} else if (data.getText().trim().equalsIgnoreCase("Paid")) {
				data.click();
//					js.executeScript("arguments[0].click();", data);
				System.out.println(data.getText());
//					Thread.sleep(2000);
			} else if (data.getText().trim().equalsIgnoreCase("Covishield")) {
				data.click();
//					js.executeScript("arguments[0].click();", data);
				System.out.println(data.getText());
//					Thread.sleep(2000);
			}
		}
		List<WebElement> validation = driver.findElements(By.xpath("//div//div[2]/ul/li/span[2]"));
		System.out.println("VERIFICATION OF DATAS ENTERED: ");
		for (WebElement checkData : validation) {
			if (checkData.getText().equals("18+")) {
				System.out.println("verified that the age is 18+");
			}
			if (checkData.getText().equals("2")) {
				System.out.println("verified that the dose in Dose 2");
			}
			if (checkData.getText().equals("Paid")) {
				System.out.println("verified that the filtered hospitals are Paid not free");
			}
			if (checkData.getText().equals("COVISHIELD")) {
				System.out.println("verified that the vaccine is Covishield");
			}

		}
//	    	   List<WebElement> allHospitals = driver.findElements(By.xpath("//h5[@class='center-name-title accessibility-plugin-ac']"));
//	    	   System.out.println("THE CENTERS ACCORDING TO REQUIRED CONDITIONS: ");
//	    	   for (WebElement hospital : allHospitals) {
//				if(hospital.isDisplayed()) {
//					System.out.println(hospital.getText());
//				}
//			}
		List<WebElement> allHospitals = driver
				.findElements(By.xpath("//div[@class='row']//descendant::div[@class='row-disp']//h5"));
		System.out.println("THE CENTERS ACCORDING TO REQUIRED CONDITIONS: ");
		
		System.out.println(allHospitals.size());
		for (int i = 1; i < allHospitals.size(); i++) {

//	    		   List<WebElement> hospitalData = driver.findElements(By.xpath("//div[@class='row']//descendant::div[@class='row-disp']"));

			WebElement hospitalname= driver.findElement(By.xpath("//div[@class='row']//descendant::div[@class='row-disp']["+i+"]//h5"));
			if (hospitalname.isDisplayed()) {

				WebElement hospital = driver
						.findElement(By.xpath("//div[@class='row']//descendant::div[@class='row-disp'][" + i + "]"));
				String verifydata = hospital.getText();
//	    				   System.out.println(verifydata);

				if (verifydata.contains("18") && verifydata.contains("Dose: #2") && verifydata.contains("PAID")
						&& verifydata.contains("COVISHIELD")) {
					System.out.println(hospitalname.getText());

				}

			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		sub_Method();

	}
}
