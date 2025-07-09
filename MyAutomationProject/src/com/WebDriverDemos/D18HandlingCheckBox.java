package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D18HandlingCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement altLink = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[15]/div/input"));
		
		System.out.println("Before");
		System.out.println("Selected: " + altLink.isSelected());
		System.out.println("Visible: " + altLink.isDisplayed());
		System.out.println("Enable: " + altLink.isEnabled());
		
		if(altLink.isSelected() == false)
		altLink.click();
		
		System.out.println("\nAfter...");
		System.out.println("Selected: " + altLink.isSelected());
		System.out.println("Visible: " + altLink.isDisplayed());
		System.out.println("Enable: " + altLink.isEnabled());

	}

}
