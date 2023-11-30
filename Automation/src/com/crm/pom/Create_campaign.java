package com.crm.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Create_campaign {
@FindBy(name="property(Campaign Name)")
WebElement cmpn_name;
@FindBy(name="property(Type)")
WebElement type;
Select s=new Select(type);


}
