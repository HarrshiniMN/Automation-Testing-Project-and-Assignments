package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SauceDemoLoginTest {
	WebDriver driver;
    SauceDemoLoginPage loginPage;
    
    @BeforeTest
    public void beforeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.saucedemo.com/");
        loginPage = new SauceDemoLoginPage(driver);
        
       

    }

    @Test
    public void testStandardUserLogin() throws InterruptedException {
        // Enter credentials first
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        
        Thread.sleep(6000);
        
        loginPage.clickLogin();
        
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Login successful. Navigated to Products page.");
        } else {
            System.out.println("Login failed or unexpected behavior.");
        }
    }

    @AfterTest
    public void afterTest() {
    	
        
    }
}
