package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D019HandlingMultipleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> products = driver.findElements(By.cssSelector("input[name^=\"group\"]"));
		for(WebElement p : products) {
			System.out.println("-------------------------");
			System.out.println("Before");
			System.out.println(p.getAttribute("value") + ": Selected: " + p.isSelected());
			
			if(p.isSelected() == false)
				p.click();
			
			System.out.println("\nAfter");
			System.out.println(p.getAttribute("value") + ": Selected: " + p.isSelected());
		}

	}

}
