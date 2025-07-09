package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocateByCssSelector_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.cssSelector("input[data-testid=\"royal-email\"]"));
		userName.sendKeys("harshu.mn@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[data-testid=\"royal-pass\"]"));
		password.sendKeys("456789");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[name=\"login\"][data-testid=\"royal-login-button\"]"));
		loginBtn.click();
	}

}
