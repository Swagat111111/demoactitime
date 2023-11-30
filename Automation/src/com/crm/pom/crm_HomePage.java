package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class crm_HomePage {
@FindBy(linkText="Logout [rashmi@dell.com]")
WebElement lgbtn;
  

public crm_HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public void setLgbtn( ) {
	 lgbtn.click();
}



}
