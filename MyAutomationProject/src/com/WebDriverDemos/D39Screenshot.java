package com.WebDriverDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class D39Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://jqueryui.com/slider/");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.linkText("Slider")).click();
		driver.switchTo().frame(0);
		
		WebElement Slider = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		
		int x = Slider.getLocation().x;
		int y = Slider.getLocation().y;
		
		act.dragAndDropBy(Slider, 80, y).perform();
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(screenshot, new File("ScreenShots\\screenImage.jpeg"));
		
		System.out.println("Screenshot Taken");
	}


	}

