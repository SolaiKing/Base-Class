package com.config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class D extends LibGlobal {
	public D() {
		//PageFactory concept
				//this----to access within the current class
				//initElements----find the locator and initialize to driver
				PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (className="login_title")
	private WebElement getbook;
	
	@FindBy (id="first_name")
	private WebElement fir;
	
	@FindBy (id="last_name")
	private WebElement las;
	
	@FindBy (id="address")
	private WebElement add;
	
	@FindBy (id="cc_num")
	private WebElement ccn;
	
	@FindBy (id="cc_type")
	private WebElement cct;
	
	@FindBy (id="cc_exp_month")
	private WebElement ccem;
	
	@FindBy (id="cc_exp_year")
	private WebElement ccey;
	
	@FindBy (id="cc_cvv")
	private WebElement ccv;
	
	@FindBy (id="book_now")
	private WebElement now;
	
	@FindBy (id="order_no")
	private WebElement order;
	

	public WebElement getGetbook() {
		return getbook;
	}

	public WebElement getFir() {
		return fir;
	}

	public WebElement getLas() {
		return las;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCcn() {
		return ccn;
	}

	public WebElement getCct() {
		return cct;
	}

	public WebElement getCcem() {
		return ccem;
	}

	public WebElement getCcey() {
		return ccey;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getNow() {
		return now;
	}
	
	public WebElement getOrder() {
		return order;
	}
	
	public void verifybook(String expvalue) {
     String actvalue = gettext(getGetbook()); 
     Assert.assertEquals("verify book", expvalue,actvalue);
	}
	
	public void book(String dat1,String dat2 ,String dat3,String dat4,String dat5,String dat6,String dat7,String dat8) {
		sendKeys(getFir(), dat1);
		sendKeys(getLas(), dat2);
		sendKeys(getAdd(), dat3);
		sendKeys(getCcn(), dat4);
		sendKeys(getCct(),  dat5);
		sendKeys(getCcem(), dat6);
		sendKeys(getCcey(), dat7);
		sendKeys(getCcv(), dat8);
		click(getNow());

	}
	
	public String order() throws InterruptedException {
		   Thread.sleep(5000);
		String actvalue = getAttribute(getOrder());
		return actvalue;
	}

}
