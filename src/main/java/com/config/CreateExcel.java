package com.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateExcel {
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		
		Select select=new Select(element);
		
		List<WebElement> options = select.getOptions();
		
		File file=new File("C:\\Users\\Solai King\\eclipse-workspace\\FrameWork\\Excel\\tiger.xlsx");
		
		Workbook workbook=new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("type");
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement a = options.get(i);
			String text = a.getText();
		//	System.out.println(text);
		 //=====================================================================   
			
			Row row = sheet.createRow(i);
			
			Cell cell = row.createCell(0);
			
			cell.setCellValue(text);
			
			} 
	
		     FileOutputStream output=new FileOutputStream(file);
		     workbook.write(output);
			 System.out.println("Thank you");
								
			}	
	
}

