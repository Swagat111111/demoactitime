package com.fb.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class base_class {
	public WebDriver driver;
@BeforeTest
public void openbrowser()
{
	driver=new ChromeDriver();
	Reporter.log("open browser",true);
}
@AfterTest
public void closebrowser()
{
	Reporter.log("closebrowser",true);
	driver.close();
}
@BeforeMethod
public void login() throws Exception
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	orange o=new orange();
	driver.get(o.getpropertydata("URL"));
	driver.findElement(By.name("username")).sendKeys(o.getpropertydata("UN"));
	driver.findElement(By.name("password")).sendKeys(o.getpropertydata("PW"));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Reporter.log("login",true);
}
@AfterMethod
public void logout()
{
	driver.findElement(By.xpath("//i[contains(@class,'oxd-icon bi-caret-down-fill oxd-userdropdown-icon')]")).click();
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("logout",true);
}
}
