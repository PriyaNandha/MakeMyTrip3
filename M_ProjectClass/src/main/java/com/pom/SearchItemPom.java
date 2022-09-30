package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchItemPom {
	
	public WebDriver driver = null;
	
	public SearchItemPom(WebDriver driver2) {
		
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="//input[@type='text']")
	private WebElement searchText;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	public WebElement submit() {
		
		return submit;
	}
	

	public WebElement getSearchText() {
		return searchText;
	}
	
	
	

}
