package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement unTbn;
	
	@FindBy(name="pwd")
	private WebElement pwTbn;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setLogin(String un,String pw)
	{
		unTbn.sendKeys(un);
		pwTbn.sendKeys(pw);
		lgBtn.click();
		
	}

}
