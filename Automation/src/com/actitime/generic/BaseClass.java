package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	file_lib f=new file_lib();
	
	@BeforeTest
	public void OpenBrowser()
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
		driver.get(f.getpropertydata("URL"));
		LoginPage l=new LoginPage(driver);
		l.setloginPage(f.getpropertydata("USN"),f.getpropertydata("PSW"));
	}
	@AfterMethod
	public void Logout()
	{
		Reporter.log("logout",true);
		HomePage h=new HomePage(driver);
		h.setLgout();
	}
	@AfterTest
	public void CloseBrowser()
	{
	Reporter.log("closebrowser",true);
	driver.quit();
	}
	

}
