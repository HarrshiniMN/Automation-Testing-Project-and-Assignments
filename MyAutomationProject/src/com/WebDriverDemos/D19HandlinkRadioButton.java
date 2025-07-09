package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D19HandlinkRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement rdioBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[9]/div/label[2]/input"));
		
		System.out.println("Before");
		System.out.println("Selected: " + rdioBtn.isSelected());
		
		rdioBtn.click();
		
		System.out.println("\nAfter");
		System.out.println("Selected: " + rdioBtn.isSelected());
		
		

	}

}
