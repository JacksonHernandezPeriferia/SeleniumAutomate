package com.AlkostoPOM.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base{
	
    By Username = By.id("login-username");
    By Password = By.id("login-password");
    By Button = By.name("send");

	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void RegisterUser() {
		if (isDisplayed(Username)) { 
				type("jlcadena9@misena.edu.co", Username);
				type("12345Jose", Password);
				click(Button);
			}else {
				System.out.println("Username textbox was not present");
			}	
	}

	public static void signInPage() {
		// TODO Auto-generated method stub
		
	}

	public static void signInPage1() {
		// TODO Auto-generated method stub
		
	}
	}
		
	
	


