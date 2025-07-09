package com.Selenium_Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class D05Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
	 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.myntra.com/");
        Thread.sleep(3000);
        
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     String destinationPath = ("/Users/harrshinimn/Desktop/Harrshini_WebDriverDemos/MyAutomationProject/MyntraScreenshot.jpeg");
        FileHandler.copy(screenshot, new File(destinationPath));
        
        driver.close();

	}

}
