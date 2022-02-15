package com.config;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class E extends LibGlobal {
	
	public E() {
		//PageFactory concept
		//this----to access within the current class
		//initElements----find the locator and initialize to driver
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="my_itinerary")
    private WebElement cancelbook;
    
    @FindBy(id="order_id_text")
    private WebElement setorderid;
    
    @FindBy(id="search_hotel_id")
    private WebElement searchid;
    
    @FindBy(xpath="(//input[@style='width:150px;'])[1]")
    private WebElement cancelid;
	
	@FindBy(id="search_result_error")
	private WebElement canceltext;


	public WebElement getCancelbook() {
		return cancelbook;
	}


	public WebElement getSetorderid() {
		return setorderid;
	}


	public WebElement getSearchid() {
		return searchid;
	}

    
	public WebElement getCancelid() {
		return cancelid;
	}


	public WebElement getCanceltext() {
		return canceltext;
	}
	


	
		
	
	
     public void orderid(String data1 ) throws InterruptedException {
             Thread.sleep(3000);
		      click(getCancelbook());
             Thread.sleep(3000);
             sendKeys(getSetorderid(),data1);
             Thread.sleep(3000);
             click(getSearchid());
             Thread.sleep(3000);
             click(getCancelid());
             Thread.sleep(3000);
		    Alert alert=driver.switchTo().alert();
		    alert.accept();
	}
     
     public void canceltxt(String expvalue) throws InterruptedException {
    	 Thread.sleep(3000);
           String actvalue = gettext(getCanceltext());
           Assert.assertEquals("verify cancel booking",expvalue, actvalue);
	}
	
		 
	
	

}
