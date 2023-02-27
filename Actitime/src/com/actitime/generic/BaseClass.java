package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass 
{
	public static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public FileLib f=new FileLib();
	
	@BeforeClass
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		
		driver.get(f.getProperty("url"));
		LoginPage l=new LoginPage(driver);
		l.setLogin(f.getProperty("username"),f.getProperty("password"));
		
	}
	
	@AfterMethod
	public void logout()
	{
		HomePage h=new HomePage(driver);
		h.setLogout();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
