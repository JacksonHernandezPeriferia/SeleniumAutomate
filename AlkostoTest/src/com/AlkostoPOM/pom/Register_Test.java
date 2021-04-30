package com.AlkostoPOM.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Register_Test {
	
	private WebDriver driver;
	RegistePage registePage;
	
	@Before
	public void setUp() throws Exception {
		registePage = new RegistePage(driver);
		driver = registePage.chromeDriverConnection();
		registePage.visit("https://www.alkosto.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		registePage.registerUser();
		assertEquals("Your User Name is confirmaded",registePage.registerMessage());
	}

}
