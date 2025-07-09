package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D33NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		//driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.google.co.in/");
		
		driver.findElement(By.partialLinkText("Busin")).click();
		Thread.sleep(3000);
		driver.navigate().back(); //to go back
		Thread.sleep(3000);
		driver.navigate().forward();  //to go forward
		
		driver.navigate().refresh();

	}

}
