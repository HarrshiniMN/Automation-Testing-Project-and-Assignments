package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D36RightClick_DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		
		WebElement rClkBttn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		//act.moveToElement(rClkBttn).contextClick().perform();  //right click option 1
		act.contextClick(rClkBttn).perform();  //right click option 2; clicks directly
		
		driver.findElement(By.xpath("//*[@id=\"authentication\"]")).click();
		
		WebElement dClkBttn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(dClkBttn).perform();
		
		
		System.out.println(driver.switchTo().alert().getText()); //shorcut for printing alert text
		driver.switchTo().alert().accept();   //shortcut to accept alert

		

	}

}
