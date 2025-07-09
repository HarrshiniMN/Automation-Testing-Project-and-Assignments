package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D29HandlingMultipleFileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_multiple");
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		driver.findElement(By.id("files")).sendKeys("/Users/harrshinimn/Downloads/ -4.jpg" +"\n"+ "/Users/harrshinimn/Downloads/ -5.jpg");
		
		
		

	}

}
