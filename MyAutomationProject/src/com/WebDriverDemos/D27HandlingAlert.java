	package com.WebDriverDemos;
	
	import java.time.Duration;
	
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class D27HandlingAlert {
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			
			driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Alert alt;
		
		WebElement but1 = driver.findElement(By.id("alertButton"));
		
		js.executeScript("arguments[0].click()", but1);
		
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(5000);
		alt.accept();
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("timerAlertButton")));
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		alt = wait.until(ExpectedConditions.alertIsPresent());
		//alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();  //to click on ok button
		
		js.executeScript("window.scrollBy(0,600)", "");
		
		driver.findElement(By.id("confirmButton")).click();
		alt = driver.switchTo().alert();
		alt.dismiss();   //to click on cancel button
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		driver.findElement(By.id("promtButton")).click();
		alt = driver.switchTo().alert();
		alt.sendKeys("Harrshini");
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		//driver.close();
		
	}

}
