package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static WebDriver driver;

	public static void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOD\\eclipse-workspace\\Ipt\\Browser\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.worldometers.info/coronavirus/");
	}
	
	public static void allHeaders() {
		System.out.println("=====Allheaders==========");
		
		List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead[not(@class)]/tr/th"));
		System.out.println("Header size is :" + allHeaders.size());
		
		for (WebElement header : allHeaders) {
//			System.out.println(header.getText());
		}
	}
	
	public static void allData() {
		
		System.out.println("====All Data=======");
		
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr/td"));
		System.out.println(allData.size());
		
		for (WebElement data : allData) {
//			System.out.println(data.getText());
			
		}
		
	}
	
	public static void row_Wise() {
		
		System.out.println("====== Row-wise data======");
		
		List<WebElement> rowWiseData = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr[7]/td"));
		System.out.println(rowWiseData.size());
		
		for (WebElement rowData : rowWiseData) {
//			System.out.println(rowData.getText());
		}
		
	}
	
	public static void column_Wise() {
		
		System.out.println("======Column-wise data");
		
		List<WebElement> columnWiseData = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr/td[2]"));
		System.out.println(columnWiseData.size());
		
		for (WebElement ColumnData : columnWiseData) {
			
//			System.out.println(ColumnData.getText());
		}
		
	}
	
	public static void particularData() {
		
		System.out.println("==== Particular data=====");
		
		WebElement particulatdata = driver.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr[7]/td[2]"));
		System.out.println(particulatdata.getText());
	}
	
	public static void main(String[] args) {
		
		browserLaunch();
		allHeaders();
		allData();
		row_Wise();
		column_Wise();
		particularData();
	}

}
