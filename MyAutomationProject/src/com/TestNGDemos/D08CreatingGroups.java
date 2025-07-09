package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D08CreatingGroups {
	WebDriver driver;
	@Test (priority = 1, groups = "Fashion")
	public void clickOnMen() {
		driver.findElement(By.linkText("Men")).click();
	}
	@Test (priority = 2, groups = "Fashion")
	public void clickOnWomen() {
		driver.findElement(By.linkText("Women")).click();
	}
	@Test (priority = 3, groups = "Mini")
	public void clickOnKids() {
		driver.findElement(By.linkText("Kids")).click();
	}
	@Test (priority = 4, groups = "Mini")
	public void clickOnHome() {
		driver.findElement(By.linkText("Home")).click();
	}
	
	@BeforeMethod (alwaysRun = true)
	public void beforeMethod() {
		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod (alwaysRun = true)
	public void afterMethod() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest (alwaysRun = true)
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest (alwaysRun = true)
	public void afterTest() {
		driver.close();
	}

}
