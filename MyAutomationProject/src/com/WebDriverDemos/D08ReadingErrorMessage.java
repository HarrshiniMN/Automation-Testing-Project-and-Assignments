package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08ReadingErrorMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("harshu");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("45678");
		WebElement loginBtn = driver.findElement(By.id("Butsub"));
		loginBtn.click();
		WebElement errorMsg = driver.findElement(By.id("lblMsg"));
		String msg = errorMsg.getText();
		
		System.out.println("Error Message is: " + msg);
		
		if(msg.contains("Invalid"))
			System.out.println("Test case pass");
			
		else
				System.out.println("Test case fail");
		
		driver.close();
		
	}

}
