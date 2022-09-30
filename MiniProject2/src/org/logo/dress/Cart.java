package org.logo.dress;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Cart extends Purchase {

	public static void screenshot(String filename) throws Exception {
		Date d = new Date();
		String filename1 = d.toString().replace(':', '_') + ".png";
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
		Files.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
				new File("C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Screenshot" + filename +" " + filename1));
	}

	public static void cart() throws Exception {

		WebDriverWait xwait1 = new WebDriverWait(driver, 50);
		xwait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@itemprop='image']")));

//		Thread.sleep(2000);

		WebElement image = driver.findElement(By.xpath("//img[@itemprop='image']"));
		a.moveToElement(image).perform();

		WebElement evendress = driver.findElement(By.xpath("//*[@class='quick-view']"));
		evendress.click();
	
//		a.moveToElement(evendress).click().perform();

//		or @class='icon-eye-open'
//		List<WebElement> framelist = driver.findElements(By.className("fancybox-iframe"));
//		

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));

		driver.switchTo().frame(frame);

		WebDriverWait xwait = new WebDriverWait(driver, 50);
		xwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-plus']")));

		Thread.sleep(2000);

		screenshot("frame1");

		WebElement quan = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		
			for (int i = 1; i <= 3; i++) {
				a.moveToElement(quan).click().perform();
			}

		Thread.sleep(2000);

		WebElement quant = driver.findElement(By.xpath("//i[@class='icon-minus']"));
		a.moveToElement(quant).click().perform();

		Thread.sleep(2000);

		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select size1 = new Select(size);
		size1.selectByValue("2");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@title='Pink']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		Thread.sleep(5000);

		screenshot("purchase");
		
		driver.findElement(By.xpath("//a[@title='Log me out']")).click();

	}

	

}
