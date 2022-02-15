package com.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task4 {
	
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
				
				//ultimate aim-to convert text into number in phone number column
				
				//get cell type(1-text====0-number)
				int cellType = cell.getCellType();
				
				if (cellType==1) {
					String data = cell.getStringCellValue();
					System.out.println(data);
					
				}
				if (cellType==0) {
					
//======================ultimate aim is format a date=================================================================================					
					//Date:c
					Date date=new Date();
					
					//SimpleDateFormat:C
					SimpleDateFormat dateformat=new SimpleDateFormat("dd-MMM-yy");
					
					//DateUtil:C====isCellDateFormatted()-m
					//true==date//false==number
					if (DateUtil.isCellDateFormatted(cell)) {
						
						//format:m
						String format = dateformat.format(date);
						
						System.out.println(format);
						
					}else {
						double dou = cell.getNumericCellValue();                           //double====10.00===string===10.55
						long lon=(long)dou;
						String valueOf = String.valueOf(lon);
						System.out.println(valueOf);

						
						
						
						
						
						
					}
					
					
				}
				
			}

			
			
		}
		
		
		
		

	}

}
