package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D35HoveringMouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://www.istqb.in/");
		
		Actions act = new Actions(driver);
		
		WebElement spmenu = driver.findElement(By.linkText("SPECIALIST"));
		act.moveToElement(spmenu).perform();
		
		List<WebElement> subMenus = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[6]/div/div/ul/li/a"));
		
		for (WebElement sm : subMenus)
			System.out.println(sm.getText());
		
		Thread.sleep(3000);
		
		driver.close();
		
	

	}

}
