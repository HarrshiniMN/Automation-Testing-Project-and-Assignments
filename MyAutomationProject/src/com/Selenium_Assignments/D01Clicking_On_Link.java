package com.Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01Clicking_On_Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        
        driver.findElement(By.linkText("Today's Deals")).click();
        Thread.sleep(4000);
        
System.out.println("Navigated to Amazon Today's Deals");
        
        driver.close();
    }

	}

