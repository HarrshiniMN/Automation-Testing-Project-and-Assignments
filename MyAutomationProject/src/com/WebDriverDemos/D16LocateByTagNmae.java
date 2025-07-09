package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16LocateByTagNmae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of Links: " + allLinks.size());
		
		String links = allLinks.get(0).getText();
		
		System.out.println("First Link: " + links);
		
		
		System.out.println("Second Link: " + allLinks.get(1).getText());
		
		System.out.println("==========================");
		
		for(WebElement link : allLinks)
			System.out.println(link.getText());
		
		
		driver.close();

	}

}
