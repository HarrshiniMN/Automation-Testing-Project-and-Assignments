package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D14ReadData {
	String fPath = "ExcelFiles//LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	
  @Test 
  public void readData() {
	  row = sheet.getRow(0);
	  cell = row.getCell(0);
	  
	  String data = cell.getStringCellValue();
	  System.out.println(data);
	  
	  cell = row.getCell(1);
	  data = cell.getStringCellValue();
	  System.out.println(data);
	  
	  cell = row.getCell(2);
	  data = cell.getStringCellValue();
	  System.out.println(data);
  }
  
  @Test
  public void readAllData() {
	  
	  int rows = sheet.getPhysicalNumberOfRows();	//will display all data in rows.
	  int cells = sheet.getRow(0).getPhysicalNumberOfCells();
	  for(int i = 0; i < rows; i++) {    //outer loop is for rows; inner loop is for cells;
		  row = sheet.getRow(i);
		  
		  for(int d = 0; d < cells; d++) {   //for cells
			  cell = row.getCell(d);
			  System.out.println(cell.getStringCellValue());
		  }
	  }
  }
  
  
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  file = new File(fPath);
	  fis = new FileInputStream(file); 
	  wb = new XSSFWorkbook(fis);      //to read the workbook which is already present
	  sheet = wb.getSheet("LoginData");
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.close();
	  fis.close();
  }

}
