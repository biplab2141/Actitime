package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage 
{
	@FindBy(xpath="//div[text()='Add New']")
	public WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	public WebElement newCustomerBtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerNameBtn;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescriptionBtn;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="(//div[text()='Our company'])[2]")
	private WebElement ourCompanyTab;
	
	@FindBy(xpath="//div[text()='Create Customer' ]")
	private WebElement createCustomerBtn;
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getEnterCustomerNameBtn() {
		return enterCustomerNameBtn;
	}

	public WebElement getCustomerDescriptionBtn() {
		return customerDescriptionBtn;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getOurCompanyTab() {
		return ourCompanyTab;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	
	
	

}
