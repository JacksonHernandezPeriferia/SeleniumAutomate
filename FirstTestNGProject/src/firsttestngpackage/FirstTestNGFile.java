package firsttestngpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class FirstTestNGFile {
	
  public String baseUrl = "http://demo.guru99.com/test/newtours";
  String driverPath = "C:\\Selenium_WebDriver\\chromedriver\\chromedriver.exe";  
  public WebDriver driver;
  
  @Test
  public void verifyHomepageTitle() {
	  
	  System.out.println("launching chrome browser");
	  System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	  driver = new ChromeDriver();
	  driver.get(baseUrl);
	  String expectedTitle = "Welcome: Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
	  driver.close();  
  }
}