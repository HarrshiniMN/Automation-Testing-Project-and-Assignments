package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandlingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		List<WebElement>headers = driver.findElements(By.tagName("th"));
		
		for(WebElement h : headers)
		System.out.println(h.getText());
		
		List<WebElement> allRows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total no of rows: " + allRows.size());
		
		Random rnd = new Random();
		int i = rnd.nextInt(10);
		//GENERATES RANDOM NO IN THE RANGE B/W 0-9
		int index = rnd.nextInt(allRows.size());
		System.out.println(allRows.get(index).getText());
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+(index+1)+"]")).getText());
		
		driver.close();
		
		

	}

}
