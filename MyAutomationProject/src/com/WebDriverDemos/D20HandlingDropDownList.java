package com.WebDriverDemos;

import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D20HandlingDropDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement dpList = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		
		Select countries = new Select(dpList);
		
		System.out.println("Selected: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement> countryList = countries.getOptions();
		System.out.println("Total Countries: " + countryList.size());
		
		int i = 0;
		for(WebElement c : countryList) { 
			System.out.println(i + "." + c.getText());
			i++;
		}
		//countries.selectByVisibleText("French Polynesia"); 
		//countries.selectByValue("150");
		countries.selectByIndex(67);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
	}

}
