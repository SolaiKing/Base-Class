package com.config;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		}
	
	@AfterClass
	public static void afterClass() {
     //driver.quit();
	}
	
	@Before
	public void before() {
    long start=System.currentTimeMillis();
    System.out.println(start);
	}
	
	@After
	public void after() {
		long end=System.currentTimeMillis();
	    System.out.println(end);
	}
	
	@Test
	public void test() {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("solai123");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("XDARtEmh8@uwnNh");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
	

}
