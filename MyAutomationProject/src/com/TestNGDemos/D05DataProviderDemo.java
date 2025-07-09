package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class D05DataProviderDemo {
  @Test(dataProvider = "dp")
  public void loginToOHRM(Integer n, String s, double d) {
	  System.out.println(n);
	  System.out.println(s);
	  System.out.println(d);
  }
 
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a", 5.3 },
      new Object[] { 2, "b", 1.2 },
    };
  }
    
    @AfterMethod
    public void afterMethod() {
    	
    }
  }

