package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D21HandlingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Select cars = new Select(driver.findElement(By.id("multiselect1")));
		
		List<WebElement> carList = cars.getOptions();
		System.out.println("All cars in the list are");
		
		for(WebElement c : carList) {
			System.out.println(c.getText());
			
			System.out.println("------------------");
			
			if(cars.isMultiple())
			cars.selectByContainsVisibleText("Swi");
			cars.selectByIndex(3);
			
			List<WebElement> selectCars = cars.getAllSelectedOptions();
			System.out.println("All selected cars");
			for(WebElement sc : selectCars) { 
				System.out.println(sc.getText());
			}
			cars.deselectByIndex(3);
		}

	}

}
