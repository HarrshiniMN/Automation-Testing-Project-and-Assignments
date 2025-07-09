package com.WebDriverDemos;

import java.nio.file.spi.FileSystemProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03ReadTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		if(title.equals("Google"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		driver.close();


	}

}
