package com.TestNGDemos;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_Client {
	WebDriver driver;
	Internet_herokuapp i1;
	@BeforeTest
	public void beforeTest()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(
	30));
	i1=new Internet_herokuapp(driver);
	driver.get("https://the-internet.herokuapp.com/login");
	}
	@Test
	public void test_Login()
	{
	i1.loginPage("harrshinimn", "SuperSecretPassword!");
	}
	@AfterTest
	public void afterTest()
	{

	}
	}
