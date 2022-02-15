package com.config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A extends LibGlobal {
	public A() {
		//PageFactory concept
		//this----to access within the current class
		//initElements----find the locator and initialize to driver
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="username")
	private WebElement txtUserName;
	
	@FindBy (id="password")
	private WebElement txtpassword;
	
	@FindBy (id="login")
	private WebElement btnlogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public void login(String username,String password ) {
		sendKeys(getTxtUserName(), username);
		sendKeys(getTxtpassword(), password);
		click(getBtnlogin());

	}
	

}
