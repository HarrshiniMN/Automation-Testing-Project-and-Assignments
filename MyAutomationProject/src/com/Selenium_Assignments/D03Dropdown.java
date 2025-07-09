package com.Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class D03Dropdown {
	public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
       
        driver.get("https://demoqa.com/select-menu");
    
        Thread.sleep(2000); 

       
        WebElement dropdownElement = driver.findElement(By.id("oldSelectMenu"));
        Select dropdown = new Select(dropdownElement);

     
        dropdown.selectByVisibleText("Green");
        System.out.println("Selected by text: " + dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("4");
        System.out.println("Selected by value: " + dropdown.getFirstSelectedOption().getText());

        dropdown.selectByIndex(2);
        System.out.println("Selected by index: " + dropdown.getFirstSelectedOption().getText());

       
        System.out.println("\nAll available options:");
        List<WebElement> options = dropdown.getOptions();
        for(WebElement option : options) {
            System.out.println(option.getText());
        }

        
        WebElement multiSelect = driver.findElement(By.id("cars"));
        Select multiDropdown = new Select(multiSelect);

        System.out.println("\nMulti-select operations:");
        multiDropdown.selectByValue("volvo");
        multiDropdown.selectByValue("audi");
        
        List<WebElement> selectedOptions = multiDropdown.getAllSelectedOptions();
        System.out.println("Currently selected:");
        for(WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        
    

    }
}
