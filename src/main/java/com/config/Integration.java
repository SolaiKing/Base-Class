package com.config;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Integration {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		LibGlobal global=new LibGlobal();
		global.getdriver();
		global.loadurl("https://adactinhotelapp.com/index.php");
		global.maximize();
		String name = global.getdata("Sheet1", 1, 0);
		String pass = global.getdata("Sheet1", 1, 1);
		
		WebElement username = global.byId("username");
		global.sendKeys(username,name);
		WebElement password = global.byId("password");
		global.sendKeys(password,pass);
		WebElement login = global.byId("login");
		global.click(login);
		
		WebElement location = global.byId("location");
		global.selectIndex(location, 1);
		WebElement hotels = global.byId("hotels");
		global.selectIndex(hotels, 1);
		WebElement room = global.byId("room_type");
		global.selectIndex(room, 2);
		WebElement roomno = global.byId("room_nos");
		global.selectIndex(roomno, 1);
		
		String indate = global.getdata("Sheet1", 1, 2);
		String outdate = global.getdata("Sheet1", 1, 3);
		WebElement checkin = global.byId("datepick_in");
		global.sendKeys(checkin, indate);
		WebElement checkout = global.byId("datepick_out");
		global.sendKeys(checkout, outdate);
		
		WebElement adult = global.byId("adult_room");
		global.selectIndex(adult, 1);
		WebElement submit = global.byId("Submit");
		global.click(submit);
		
		WebElement radiobtn = global.byId("radiobutton_0");
		global.click(radiobtn);
		WebElement cont = global.byId("continue");
		global.click(cont);
		
		
		String first = global.getdata("Sheet1", 1, 4);
		String last = global.getdata("Sheet1", 1, 5);
		String address = global.getdata("Sheet1", 1, 6);
		String creditcard = global.getdata("Sheet1", 1, 7);
		String cvno = global.getdata("Sheet1", 1, 8);
		WebElement fname = global.byId("first_name");
		global.sendKeys(fname, first);
		WebElement lname = global.byId("last_name");
		global.sendKeys(lname, last);
		WebElement addr = global.byId("address");
		global.sendKeys(addr, address);
		WebElement card = global.byId("cc_num");
		global.sendKeys(card, creditcard);
		WebElement cctype = global.byId("cc_type");
		global.selectIndex(cctype, 2);
		WebElement month = global.byId("cc_exp_month");
		global.selectIndex(month, 2);
		WebElement year = global.byId("cc_exp_year");
		global.selectIndex(year, 12);
		
		WebElement cv = global.byId("cc_cvv");
		global.sendKeys(cv, cvno);
		WebElement book = global.byId("book_now");
		global.click(book);
		 Thread.sleep(5000);
		WebElement order = global.byId("order_no");
		String attribute = global.getAttribute(order);
		global.write("Sheet1", 1, 9, attribute);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
