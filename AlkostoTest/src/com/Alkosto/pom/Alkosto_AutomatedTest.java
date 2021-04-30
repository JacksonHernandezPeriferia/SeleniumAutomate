package com.Alkosto.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alkosto_AutomatedTest {
	
	private WebDriver driver;
	By MyAcount = By.linkText("Mi cuenta");
    By Username = By.id("login-username");
    By Password = By.id("login-password");
    By Button = By.name("send");
    
    By AddressBook = By.linkText("Libreta de direcciones");
    By CC = By.name("cardtype");
    By NumberID = By.id("cardnumber");
    By FirtsName = By.name("firstname");
    By SecondName = By.name("middlename");
    By FirstlastName = By.name("lastname");
    By SecondlastName = By.name("mothersname");
    By PhoneNumber = By.id("celular");
    By OtherPhoneNumber = By.name("telephone");
            
    By Department = By.name("region_id");
    By City = By.name("city");
    By Address = By.name("street[]");
    By Neighborhood = By.id("observaciones");
    By Structure = By.name("address_name");
    By AddressSave = By.name("");
    
  

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_WebDriver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.alkosto.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test	
	public void RegisterUser() throws InterruptedException {
		driver.findElement(MyAcount).click();
		Thread.sleep(2000);
		driver.findElement(Username).sendKeys("jlcadena9@misena.edu.co");
		driver.findElement(Password).sendKeys("12345Jose");
		driver.findElement(Button).click();
		driver.findElement(AddressBook).click();
		Select DropCC = new Select(driver.findElement(By.name("cardtype")));
		 DropCC.selectByVisibleText("CC");
		driver.findElement(NumberID).sendKeys("1014309739");
		driver.findElement(FirtsName).sendKeys("José");
		driver.findElement(SecondName).sendKeys("Luis");
		driver.findElement(FirstlastName).sendKeys("Cadena");
		driver.findElement(SecondlastName).sendKeys("Torres");
		driver.findElement(PhoneNumber).sendKeys("3138848929");
		driver.findElement(OtherPhoneNumber).sendKeys("3142384096");
		Select DropDeparment = new Select(driver.findElement(By.name("region_id")));
		 DropDeparment.selectByVisibleText("BOGOTA D.C.");
		Select DropCity = new Select(driver.findElement(By.name("city")));
		 DropCity.selectByVisibleText("SOACHA");
		driver.findElement(Address).sendKeys("Cr 68 # 71 C-34");
		driver.findElement(Neighborhood).sendKeys("Villa Amalia");
		driver.findElement(Structure).sendKeys("Casa");
		
	}

}
