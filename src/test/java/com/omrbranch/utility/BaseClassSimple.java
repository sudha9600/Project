package com.omrbranch.utility;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassSimple {
Select select;
	public static WebDriver driver;
    
	public void browserLaunch() {
		driver = new ChromeDriver();
	}

	public void enterApplicationUrl(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void sendKeysElement(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void clickElement(WebElement element) {
		element.click();
	}

	public String getApplicationTitle() {
		@Nullable
		String title = driver.getTitle();
		return title;
	}

	public WebElement findLocatorById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public WebElement findLocatorByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	public WebElement findLocatorByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}

	public WebElement findLocatorByXpath(String exp) {
		WebElement element = driver.findElement(By.xpath(exp));
		return element;
	}

	public String getApplicationUrl() {
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public String getTextElement(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getDomPropertyValue(WebElement element) {
		@Nullable
		String domProperty = element.getDomProperty("value");
		return domProperty;
	}

	public String getDomPropertyValue(WebElement element, String attributeName) {
		@Nullable
		String domProperty = element.getDomProperty("value");
		return domProperty;
	}

	public void closeWindow() {
		driver.close();
	}

	public void closeAllWindow() {
		driver.quit();
	}

	public boolean isDisplayedElement(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public boolean isEnabledElement(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public boolean isSelectedElement(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	public void selectElement(WebElement element){
		Select select=new Select(element);
		select.selectByValue(getApplicationTitle());
	}
	 
	
}
