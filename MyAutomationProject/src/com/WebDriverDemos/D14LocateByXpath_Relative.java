package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14LocateByXpath_Relative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//form[@data-testid=\"royal_login_form\"]/div/div/input")).sendKeys("harrshini.mn@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("34567");
		driver.findElement(By.xpath("//*[@data-testid=\"royal-login-button\"]")).click();
		

	}

}
