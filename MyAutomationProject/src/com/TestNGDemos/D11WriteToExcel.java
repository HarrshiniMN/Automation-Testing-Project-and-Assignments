package com.TestNGDemos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D11WriteToExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook  wb;           //xml spreadsheet format(new version), HSSF horible spreadsheet format(old)
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
  @Test
  public void writeToExcel() {
	  row = sheet.createRow(0);    //create 1st row
	  cell = row.createCell(0);    //creates 1st cell in 1st row
	  
	  cell.setCellValue("Welcome Harrshini");
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  file = new File("MyFirstExcel.xlsx");
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet("Sheet1");
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);       //will physically write data to file
	  wb.close();
  }

}
