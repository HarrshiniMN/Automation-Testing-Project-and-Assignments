package com.WebDriverDemos;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class D25Synchronization_Fluent_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		//source city
				driver.findElement(By.id("src")).sendKeys("ch");
				wait.withTimeout(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class)
				.pollingEvery(Duration.ofMillis(5))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();
			
				//driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
				
				//target city
				driver.findElement(By.id("dest")).sendKeys("koc");
				wait.withTimeout(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class)
				.pollingEvery(Duration.ofMillis(5))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]"))).click();
				//driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/di[3]/div[1]/ul/li[1]/div/text")).click();
				
				//calendar
				driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
				
				//selecting date
				driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div[6]/span/div[3]/span")).click();
				
				//search buses
				driver.findElement(By.id("search_button")).click();
				
				//display result

				System.out.println(wait.withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class).pollingEvery(Duration.ofMillis(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"32268218\"]/div[1]/div/div[1]/div[1]/div[1]/div[1]"))).getText());
				
				driver.close();
				

				}

	}

