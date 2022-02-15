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

public class Task1 {
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\\\Users\\\\Solai King\\\\eclipse-workspace\\\\FrameWork\\\\Excel\\\\cat.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		
		Workbook workbook=new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(1);
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		
		//to print  cells
		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			Cell cell = row.getCell(i);
			System.out.println(cell);
			
		}
		
	}

}
