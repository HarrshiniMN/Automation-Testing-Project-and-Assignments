package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.name("email"));
		
		userName.sendKeys("harrshini.mn@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();

	}

}
