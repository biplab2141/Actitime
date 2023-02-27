package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(id="logoutLink")
	public WebElement lgOut;
	
	@FindBy(id="container_tasks")
	public WebElement taskListTab;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setLogout()
	{
		lgOut.click();
	}
	
	public void taskList()
	{
		taskListTab.click();
	}

}
