package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D15LocateByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//form[@data-testid=\"royal_login_form\"]/div[1]/div[1]/input")).sendKeys("harrshini.mn@gmail.com");
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("234567");
		driver.findElement(By.tagName("button")).click();

	}

}
