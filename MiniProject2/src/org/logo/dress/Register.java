package org.logo.dress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static WebDriver driver;
//	public static JavascriptExecutor js;

	public static void regist() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOD\\eclipse-workspace\\MiniProject2\\Browsers\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("priyankacse913@gmail.com");
//		js.executeScript("arguments[0].value='priyankacse913@gmail.com",acc);
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
		Thread.sleep(2000);

		
		WebElement firstname= driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		js.executeScript("arguments[0].value='Priyanka'", firstname);
		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("Krishnamoorthy");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("priya123");
		Thread.sleep(2000);

		
		WebElement date = driver.findElement(By.xpath("//select[@name='days']"));
		Select opt1 = new Select(date);
		opt1.selectByValue("9");
		Thread.sleep(2000);

		
		WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
		Select opt2 = new Select(month);
		opt2.selectByValue("4");
		Thread.sleep(2000);

		
		WebElement year = driver.findElement(By.xpath("//select[@name='years']"));
		Select opt3 = new Select(year);
		opt3.selectByValue("1997");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priyanka");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='lastname']"));
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("CSS");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("123");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("My Street");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Kingston");
		Thread.sleep(2000);

		
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select opt4 = new Select(state);
		opt4.selectByValue("32");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("12401");
		Thread.sleep(2000);

		
		WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
		Select opt5 = new Select(country);
		opt5.selectByValue("21");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys("Newyork");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456789");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("987654321");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("Newyork");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		

	}

	public static void main(String[] args) throws Exception {
		
		regist();

	}

}
