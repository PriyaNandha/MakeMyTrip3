package com.baseclass.general;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browser\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browser\\chromedriver.exe");

			driver = new EdgeDriver();

		} else {

			System.out.println("Invalid browser");
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void launchUrl(String element) {
		driver.get(element);
	}
	
	public static  void getWindowTitle() {
		driver.getCurrentUrl();
	}
	
	public static void getWindowUrl() {
		driver.getTitle();
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void escapeKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
	public static void explicitWaitForElementVisibility(WebElement element) {

		WebDriverWait xwait = new WebDriverWait(driver, 50);
		xwait.until(ExpectedConditions.visibilityOf(element));
	}

	public static boolean elementIsDisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();
//		System.out.println(displayed);
		return displayed;

	}

	public static boolean elementIsEnabled(WebElement element) {

		boolean enabled = element.isEnabled();
//		System.out.println(enabled);
		return enabled;

	}

	public static boolean elementIsSelected(WebElement element) {

		boolean selected = element.isEnabled();
//		System.out.println(selected);
		return selected;

	}

	public static void userInput(WebElement element, String searchValue) {
		explicitWaitForElementVisibility(element);
//		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
		element.sendKeys(searchValue);
//		}

	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void elementGetText(WebElement element) {
		
		element.getText();
	}
	
	public static void elementGetAttribute(WebElement element, String attributename) {
		
		element.getAttribute(attributename);
		
	}
	
	public static void clickOnWebelement(WebElement element) {
		
		explicitWaitForElementVisibility(element);
//		if (elementIsEnabled(element) && elementIsDisplayed(element)) {
			
			element.click();
//		}
		
	}
	public static void clearValueofWebelement(WebElement element) {
		
		explicitWaitForElementVisibility(element);
		if (elementIsEnabled(element) && elementIsDisplayed(element)) {
			
			element.click();
		}
	}
	
	public void scrollUsingElement(WebElement element, String option) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0], scrollIntoView();", element);
	}

	public void scrollUsingCoOrdinates(String width, String height) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(" + width + "," + height + ")");
	}

	public void scrollToBottomOfthePage() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void scrollToTopOfThePage() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}
	
	public void dragAndDrop(WebElement sourceElement, WebElement placedElement) {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(sourceElement, placedElement);
	}

	public void simpleAlert(WebElement element) {
			explicitWaitForElementVisibility(element);
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
			driver.switchTo().defaultContent();
	}

	public void confirmAlert(WebElement element, String condition) {
			explicitWaitForElementVisibility(element);
			Alert confirmAlert = driver.switchTo().alert();
			if (condition.equalsIgnoreCase("accept")) {
				confirmAlert.accept();
				driver.switchTo().defaultContent();
			} else if (condition.equalsIgnoreCase("dismiss")) {
				confirmAlert.dismiss();
				driver.switchTo().defaultContent();
	}
}
	
	public static void switchToFrameUsingId(String option, int index) {

			if (option.equals("id")) {
				driver.switchTo().frame(index);
			}
	}
	
	public static void windowHandle() {
		
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
	}
	
	
	public static void actions(WebElement element, String options) {

		Actions a = new Actions(driver);
		if (options.equalsIgnoreCase("move to element")) {
			a.moveToElement(element).perform();
			a.click().perform();
		} else if (options.equalsIgnoreCase("right click")) {
			a.contextClick(element).perform();
		} else if (options.equalsIgnoreCase("double click")) {
			a.doubleClick(element).perform();
		} else {
			System.out.println("invalid entry");
		}
	}

	public static void browserClose() {

		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

}
