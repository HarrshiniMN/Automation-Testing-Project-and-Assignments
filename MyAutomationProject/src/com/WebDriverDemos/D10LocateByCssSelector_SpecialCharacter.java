package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByCssSelector_SpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.cssSelector("input[placeholder*=\"address\"]"));
		userName.sendKeys("harrshini.mn@gmail.com");
		WebElement passcode = driver.findElement(By.cssSelector("input[placeholder$=\"word\"]"));
		passcode.sendKeys("456789");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[id^=\"u_0_5_\"]"));
		loginBtn.click();
		

	}

}
