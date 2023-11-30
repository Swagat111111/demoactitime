package com.fb.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class common_code {
public static WebDriver driver;
	@BeforeTest
	public void openbrowser()
	{
		Reporter.log("openbrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeMethod
	public void login() throws Exception
	{
		Reporter.log("login",true);
		orange_app app=new orange_app();
		driver.get(app.getpropertydata("URL"));
		driver.findElement(By.name("username")).sendKeys(app.getpropertydata("UN"));
		driver.findElement(By.name("password")).sendKeys(app.getpropertydata("PW"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@AfterTest
	public void closebrowser()
	{
		Reporter.log("closebrowser",true);
		driver.close();
	}

}
