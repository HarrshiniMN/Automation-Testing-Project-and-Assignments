package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D13CreateLoginData {
	String fPath = "ExcelFiles//LoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i =0;
	
  @Test(dataProvider = "getLoginData")
  public void writeToExcelFile(String un, String ps) {
	  sheet.createRow(i).createCell(0).setCellValue(un);
	  sheet.getRow(i).createCell(1).setCellValue(ps);
	  sheet.getRow(i).createCell(2).setCellValue("Not Run");
	  i++;
  }

  @DataProvider
  public Object[][] getLoginData() {
    return new Object[][] {
      new Object[] { "student", "Password123"},
      new Object[] { "Harrshini", "Harshu123"},
      new Object[] { "Harini", "Password123"},
    };
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  file = new File(fPath);
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet("LoginData");
	  
	  sheet.createRow(i).createCell(0).setCellValue("UserName");
	  sheet.getRow(i).createCell(1).setCellValue("Password");
	  sheet.getRow(i).createCell(2).setCellValue("Result");
	  i++;
	  
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }
  

}
