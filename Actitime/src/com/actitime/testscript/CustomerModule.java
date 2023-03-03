package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass
{
	@Test
	public void CreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String customerName=f.getExcelData("CreateCustomer", 1, 3);
		String customerDescription=f.getExcelData(customerName, 1, 4);
		HomePage h=new HomePage(driver);
		h.taskList();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomerBtn().click();
		t.getEnterCustomerNameBtn().sendKeys(customerName);
		t.getCustomerDescriptionBtn().sendKeys(customerDescription);
		t.getSelectCustomerDD().click();
		t.getOurCompanyTab().click();
		t.getCreateCustomerBtn().click();
		
	
		//Assert.assertEquals(customerName,);
	}
	@Test
	public void UpdateCustomer()
	{
		Reporter.log("UpdateCustomer",true);
	}
	

}
