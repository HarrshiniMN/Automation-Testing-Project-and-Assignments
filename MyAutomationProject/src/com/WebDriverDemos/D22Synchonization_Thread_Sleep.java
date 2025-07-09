package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D22Synchonization_Thread_Sleep {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.redbus.in/");
	
	//source city
	driver.findElement(By.id("src")).sendKeys("ch");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
	
	//target city
	driver.findElement(By.id("dest")).sendKeys("koc");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div/text")).click();
	
	//calendar
	driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
	
	//selecting date
	driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div[6]/span/div[3]/span")).click();
	
	//search buses
	driver.findElement(By.id("search_button")).click();
	
	//display result
	Thread.sleep(10000);
	System.out.println(driver.findElement(By.xpath("//*[@id=\"29785840\"]/div[1]/div/div[1]/div[1]/div[1]/div[1]")).getText());
	
	driver.close();
	

	}

}
