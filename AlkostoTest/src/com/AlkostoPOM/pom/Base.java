package com.AlkostoPOM.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_WebDriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}//ready
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}//ready2
	
	public List<WebElement> findElements(By locator){
		return  driver.findElements(locator);
	}//ready
	
	public String getText(WebElement element) {
		return element.getText();
	}//ready
	
	public String getText(By locator) {
	    return driver.findElement(locator).getText();
    }//ready
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}//ready
	
	public void click(By locator) {
		driver.findElement(locator).click();	
	}//ready
	
	public void click(WebElement element) {
		element.click();
	}
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
 	}//ready
	
	public void visit(String url) {
	   driver.get(url);	
	}//ready

}
