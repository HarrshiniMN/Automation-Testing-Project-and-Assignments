package com.WebDriverDemos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D30RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://sampleapp.tricentis.com/101/index.php#");
		
		Robot rbt = new Robot();
		
		driver.findElement(By.partialLinkText("Auto")).click();
		driver.findElement(By.linkText("Enter Insurant Data")).click();
		driver.findElement(By.id("open")).click();
		
		for(int i = 1; i <= 8; i++) {
			Thread.sleep(500);
			rbt.keyPress(KeyEvent.VK_TAB);
		}
			
		}

	}

