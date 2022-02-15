package com.config;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C extends LibGlobal {
	public C() {
		//PageFactory concept
		//this----to access within the current class
		//initElements----find the locator and initialize to driver
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (className="login_title")
	private WebElement getsel;

	@FindBy (id="radiobutton_0")
	private WebElement radiobtn;
	

	@FindBy (id="continue")
	private WebElement contbtn;

    
	public WebElement getGetsel() {
		return getsel;
	}


	public WebElement getRadiobtn() {
		return radiobtn;
	}

     
	 public WebElement getContbtn() {
		return contbtn;
	}
	 
	 public void getSel(String expvalue) {
	     String actvalue = gettext(getGetsel());
	     Assert.assertEquals("verify select", expvalue,actvalue);
	     
	       }
	
	 public void select() {
         click(getRadiobtn());
         click(getContbtn());
		}	
}
