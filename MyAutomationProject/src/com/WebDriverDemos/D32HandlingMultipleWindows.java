package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D32HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://www.naukri.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.xpath("//*[@id=\"trending-naukri-wdgt\"]/div/div[1]/a[1]/span")).click();
		
		System.out.println("Title: " + driver.getTitle());
		
		Set<String>windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator<String>itr = windows.iterator();
		String win1 = itr.next();  //read id of 1st window
		String win2 = itr.next();  //read id of 2nd window
	
		
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		

		driver.findElement(By.xpath("//label[@for='chk-Work from office-wfhType-']//i[@class='ni-icon-unchecked']")).click();
		
		
		driver.switchTo().window(win1);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[7]/div/div/div[1]/div/div/div/div[1]/div/input")).sendKeys("Automation Testing");
		
		Thread.sleep(5000);
		
		
		driver.quit();

	}

}
