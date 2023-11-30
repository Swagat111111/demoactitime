package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")
WebElement untbx;

@FindBy(xpath="//input[@name='pwd']")
WebElement pwtbx;


@FindBy(xpath="//div[text()='Login ']")
WebElement lgbtn;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void setloginPage(String un,String pw)
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgbtn.click();
}

}
