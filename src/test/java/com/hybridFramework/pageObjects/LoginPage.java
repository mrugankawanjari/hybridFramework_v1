package com.hybridFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver localdriver;
	
	//constructor created
	public LoginPage(WebDriver remotedriver){
		localdriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	//find element present on login page
	@FindBy(name="uid")
	WebElement txtUserName;
	
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	//action method for username
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd){
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		btnLogin.click();
	}
}
