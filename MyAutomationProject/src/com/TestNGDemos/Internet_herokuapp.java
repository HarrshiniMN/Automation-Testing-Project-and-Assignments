package com.TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Internet_herokuapp {
	WebDriver driver;
	public Internet_herokuapp(WebDriver d)
	{
	this.driver=d;
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="username") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="/html/body/div[2]/div/div/form/button")
	private WebElement login_button;
	@FindBy(xpath="//*[@id=\"flash\"]") private WebElement
	success_msg;
	public WebElement getUsername() {
	return username;
	}
	public WebElement getPassword() {
	return password;
	}
	public WebElement getLogin_button() {
	return login_button;
	}
	public WebElement getSuccess_msg() {
	return success_msg;
	}
	public void loginPage(String UN,String Pass)
	{
	getUsername().sendKeys(UN);
	getPassword().sendKeys(Pass);
	getLogin_button().click();
	System.out.println(getSuccess_msg().getText());
	}
	}
