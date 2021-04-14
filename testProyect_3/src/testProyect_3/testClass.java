package testProyect_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

  public class testClass {
	  
	  public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium_WebDriver\\chromedriver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://google.com");  
	  }
}
