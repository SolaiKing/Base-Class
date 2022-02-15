package com.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FrameworkExcel {
	public static void main(String[] args) throws IOException {
		//Excel location=====File:C
		File file=new File("C:\\Users\\Solai King\\eclipse-workspace\\FrameWork\\Excel\\cat.xlsx");
		
		//get objects from file===FileInputStream:C
		FileInputStream stream=new FileInputStream(file);
		
		//create Workbook===(collection of Sheets)===WorkBook:I
		Workbook workbook=new XSSFWorkbook(stream);
		
		//Get the sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		
		//get the row by index
		Row row = sheet.getRow(4);
		
		//get the cell (column) by index
		Cell cell = row.getCell(2);
		
		//print the cell
		System.out.println(cell);
		
		//get a row count
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		
		//get a cell count
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);
		
		//to print all rows
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			System.out.println(row2);
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
}
