package com.AlkostoPOM.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistePage extends Base{
	
	By MyAcount = By.linkText("Mi cuenta");
    By Username = By.id("login-username");
    By Password = By.id("login-password");
    By Button = By.name("send");
    
	public RegistePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registerUser() throws InterruptedException {
		click(MyAcount);
		Thread.sleep(2000);
		if (isDisplayed(MyAcount)) {
			type("jlcadena9@misena.edu.co", Username);
			type("12345Jose", Password);
			click(Button);
		}else {
			System.out.println("Your user is confirmaded");
		}
	}
	
	public String registerMessage() {
		return "";
	}

}
