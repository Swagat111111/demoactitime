package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class crm_LoginPage {
	@FindBy(xpath="//input[@id='userName']")
	WebElement untbx;
	@FindBy(xpath="//input[@id='passWord']")
	WebElement pwtbx;
	@FindBy(xpath="//input[@type='image']")
	WebElement sgbtn;
public crm_LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void setlogin(String un,String pw)
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	sgbtn.click();
}
}
