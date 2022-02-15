package com.config;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B extends LibGlobal {
	
	public B() {
		//PageFactory concept
				//this----to access within the current class
				//initElements----find the locator and initialize to driver
				PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="username_show")
	private WebElement getnam;

	
	@FindBy (id="location")
	private WebElement loc;
	
	@FindBy (id="hotels")
	private WebElement hot;
	
	@FindBy (id="room_type")
	private WebElement typ;
	
	@FindBy (id="room_nos")
	private WebElement nos;
	
	@FindBy (id="datepick_in")
	private WebElement in;
	
	@FindBy (id="datepick_out")
	private WebElement out;
	
	@FindBy (id="adult_room")
	private WebElement adu;
	
	@FindBy (id="Submit")
	private WebElement sub;
	
	public WebElement getGetnam() {
		return getnam;
	}

	
	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getTyp() {
		return typ;
	}

	public WebElement getNos() {
		return nos;
	}

	public WebElement getIn() {
		return in;
	}

	public WebElement getOut() {
		return out;
	}

	public WebElement getAdu() {
		return adu;
	}

	public WebElement getSub() {
		return sub;
	}
	
	//create method to get the attribute
	public void verifyMsg(String expvalue) {
     String actvalue = getAttribute(getGetnam());
     Assert.assertEquals("verify name", expvalue,actvalue);
	}
	
	public void submit(String data1,String data2,String data3,String data4,String data5,String data6,String data7) {

		sendKeys(getLoc(), data1);
		sendKeys(getHot(), data2);
		sendKeys(getTyp(), data3);
		sendKeys(getNos(), data4);
		sendKeys(getIn(), data5);
		sendKeys(getOut(), data6);
		sendKeys(getAdu(), data7);
		click(getSub());
	}

}
