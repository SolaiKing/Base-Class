package com.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task3 {
	public static void main(String[] args) throws IOException {
	
	File file=new File("C:\\\\Users\\\\Solai King\\\\eclipse-workspace\\\\FrameWork\\\\Excel\\\\cat.xlsx");
	
	FileInputStream stream=new FileInputStream(file);
	
	Workbook workbook=new XSSFWorkbook(stream);
	
	//to print all rows
	
	Sheet sheet = workbook.getSheet("Sheet1");
	
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		
		Row row = sheet.getRow(i);
		
		for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			
//================ultimate aim-to convert text into number in phone number column====================================================
			
			//get cell type(1-text====0-number)
			int cellType = cell.getCellType();
			
			if (cellType==1) {
				String data = cell.getStringCellValue();
				System.out.println(data);
				
			}
			if (cellType==0) {
				double dou = cell.getNumericCellValue();                           //double====10.00===string===10.55
				                                                                //     !!
				//convert double to long                                           //long=====10=======string===10
				long lon=(long)dou;
				
				//convert long to string
				String valueOf = String.valueOf(lon);
				System.out.println(valueOf);
				
				
			}
			
		}

		
		
	}
	
	
	
	

}

}
