package com.crm.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Campaign_Page {
@FindBy(linkText="Campaigns")
WebElement cmpnbtn;
@FindBy(xpath="//input[@value='New Campaign']")
WebElement newcmpn;
public WebElement getCmpnbtn() {
	return cmpnbtn;
}
public WebElement getNewcmpn() {
	return newcmpn;
}
}