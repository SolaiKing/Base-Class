package com.config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class F extends LibGlobal {
	  
	@BeforeClass
	public static void beforeClass() {
          getdriver();
          maximize();
          loadurl("https://adactinhotelapp.com/index.php");
	}
	@AfterClass
	public static  void afterClass() {
	//	close();

	}
	
	@Test
    public void searchHotel() throws InterruptedException {
		A LoginPage=new A();
		LoginPage.login("solai123", "XDARtEmh8@uwnNh");
	//=========================================================================================================================
		B SearchHotelPage=new B();
		SearchHotelPage.verifyMsg("Hello solai123!");
		SearchHotelPage.submit("Sydney", "Hotel Creek", "Double", "1-One", "21/12/2021", "22/12/2021","1-One" );
	//=========================================================================================================================
		C SelectHotelPage=new C();
		SelectHotelPage.getSel("Select Hotel");
		SelectHotelPage.select();
	//================================================================================================================================
		D BookHotel=new D();
		BookHotel.verifybook("Back");
		BookHotel.book("solai", "king", "qwerty", "1234567890123456", "VISA", "January", "2022", "1234");
		String orderid = BookHotel.order();
	//========================================================================================================================
		E cancelbook=new E();
		
		cancelbook.orderid(orderid);
		System.out.println(orderid);
		cancelbook.canceltxt("The booking has been cancelled.");
		System.out.println("The booking has been cancelled.");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

