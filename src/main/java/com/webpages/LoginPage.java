package com.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	
	private By emailId = By.id("email");
	private By password = By.id("pass");
	private By loginButton = By.id("u_0_d_Xa");

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	/**
	 * @return the emailId
	 */
	public WebElement getEmailId() {
		return getElement(emailId);
	}

	

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}

	

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}
	
	
	public HomePage doLogin(String emailId, String password) {
		getEmailId().sendKeys("emailId");
		getPassword().sendKeys("password");
		getLoginButton().click();
		
		return getInstance(HomePage.class);
		
	}
	
	

	
	
}
