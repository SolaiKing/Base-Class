package com.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass1 {
	private void write(String sheetname,int rowno,int cellno,String data) throws IOException {
	   File file=new File("C:\\\\Users\\\\Solai King\\\\eclipse-workspace\\\\FrameWork\\\\Excel\\\\cat.xlsx");
	    FileInputStream stream=new FileInputStream(file);
	    Workbook workbook=new XSSFWorkbook(stream);
	    Sheet sheet = workbook.getSheet(sheetname);
	    Row row = sheet.createRow(rowno);
	    Cell createCell = row.createCell(cellno);
	    createCell.setCellValue(data);
	    FileOutputStream output=new FileOutputStream(file);
	    workbook.write(output);
	}
	public static void main(String[] args) throws IOException {
		BaseClass1 base=new BaseClass1();
		base.write("Sheet1", 15, 0, "solai");
	}

}
