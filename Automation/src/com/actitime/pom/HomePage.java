package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(linkText="Logout")
WebElement lgout;

@FindBy(xpath="//a[@class='content tasks']")
WebElement tasktab;

@FindBy(xpath="//div[text()='TASKS']")
private WebElement tskbtn;

public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void setLgout() {
	 lgout.click();
}


public void settasktab()
{
	tskbtn.click();
}

}
