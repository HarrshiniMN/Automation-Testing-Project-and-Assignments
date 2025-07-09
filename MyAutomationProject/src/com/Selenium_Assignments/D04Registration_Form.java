package com.Selenium_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04Registration_Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
	        driver.findElement(By.id("input-firstname")).sendKeys("Ravi");
	        driver.findElement(By.id("input-lastname")).sendKeys("Verma");
	        driver.findElement(By.id("input-email")).sendKeys("raviverma2000@example.com");
	        driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
	        Thread.sleep(3000);
	        driver.findElement(By.id("input-password")).sendKeys("Test@123");
	        driver.findElement(By.id("input-confirm")).sendKeys("Test@123");
     driver.findElement(By.name("agree")).click();
	        Thread.sleep(3000);

	     driver.findElement(By.xpath("//input[@value='Continue']")).click();

	     Thread.sleep(5000);
	        driver.quit();
	    }
	}