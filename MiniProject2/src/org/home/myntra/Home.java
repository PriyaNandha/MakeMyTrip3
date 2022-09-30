package org.home.myntra;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions a;
	public static int minprice;
	public static String price;

	public static void browserlaunch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void getTotalNumberOfProducts() throws AWTException {

		a = new Actions(driver);

		WebElement kid = driver
				.findElement(By.xpath("(//a[text()='Women'])[1]//ancestor::div[3]/child::div[3]/child::div/a"));

		a.moveToElement(kid).build().perform();

		WebElement product = driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]"));
		a.moveToElement(product).click().perform();

		List<WebElement> list = driver.findElements(By.xpath("//li[@class='product-base']"));

		int size = list.size();
		System.out.println("total number products are : " + size);
		System.out.println();

	}

	public static void getMinPrice() {

		List<Integer> allprices = new ArrayList<Integer>();

		List<WebElement> discountedprice = driver.findElements(
				By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));

		for (WebElement minprices : discountedprice) {
			String prices = minprices.getText().replaceAll("[^0-9]", "");
			Integer priceValue = Integer.valueOf(prices);
			allprices.add(priceValue);

		}

		List<WebElement> withoutDiscountedPrice = driver
				.findElements(By.xpath("//li[@class='product-base']//descendant::span[1][contains(text(),'Rs.')]"));
		for (WebElement minprices : withoutDiscountedPrice) {
			String prices = minprices.getText().replaceAll("[^0-9]", "");
			Integer priceValue = Integer.valueOf(prices);
			allprices.add(priceValue);
		}

		 minprice = Collections.min(allprices);
		System.out.println("Minimum price is : " + minprice);

	}

	public static void getMinPriceProductName(int min_Price) throws InterruptedException {
		System.out.println(min_Price);
		Thread.sleep(2000);
		WebElement productNameOfMinPrice= driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()='"+ min_Price +"']/ancestor::div[2]/h3"));
		String price = productNameOfMinPrice.getText();
		System.out.println("Product brand name of minimum price: " + price);

	}

	public static void productInfo(int min_Price) {
		
		WebElement productNameOfMinPrice= driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()='"+ min_Price +"']/ancestor::div[2]/h4"));
		String productName = productNameOfMinPrice.getText();
		System.out.println("Product name of minimum price: " + productName);
		
	}
	
	

	public static void main(String[] args) throws AWTException, InterruptedException {

		browserlaunch();

		getTotalNumberOfProducts();

		getMinPrice();

		getMinPriceProductName(minprice);

		productInfo(minprice);
	}

}
