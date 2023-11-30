package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class taskPage {

	@FindBy(xpath="(//div[@class='addNewButton'])[1]")
	private WebElement addnewbtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustbtn;

	@FindBy(id="customerLightBox_nameField")
	private WebElement cstmnametextbx;

	@FindBy(id="customerLightBox_descriptionField")
	private WebElement cstmdescriptextbox;

	@FindBy(xpath="//button[@class='x-btn-text']")
	private WebElement exitingcustm;

	@FindBy(linkText="Our Company")
	WebElement ourcompanybtn;

	@FindBy(xpath="//span[text()='Create Customer']")
	WebElement creatcustomerbtn;
	//22222222222222222222222222222222222222222222222222222222222
	@FindBy(xpath="//div[text()='+ New Project']")
	WebElement newprojectbtn;

	@FindBy(id="projectPopup_projectNameField")
	WebElement projectnametbx;

	@FindBy(xpath="//button[text()='-- Please Select Customer to Add Project for  --']")
	WebElement customerddbtn;

	@FindBy(id="ext-gen110")
	WebElement hdfc_001;

	@FindBy(id="projectPopup_projectDescriptionField")
	WebElement projectdesctbx;

	@FindBy(xpath="//span[text()='Create Project']")
	WebElement createprojectbtn;
	public WebElement getNewprojectbtn() {
		return newprojectbtn;
	}

	public WebElement getProjectnametbx() {
		return projectnametbx;
	}

	public WebElement getCustomerddbtn() {
		return customerddbtn;
	}

	public WebElement getHdfc_001() {
		return hdfc_001;
	}

	public WebElement getProjectdesctbx() {
		return projectdesctbx;
	}

	public WebElement getCreateprojectbtn() {
		return createprojectbtn;
	}

	public taskPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustbtn() {
		return newcustbtn;
	}

	public WebElement getCstmnametextbx() {
		return cstmnametextbx;
	}

	public WebElement getCstmdescriptextbox() {
		return cstmdescriptextbox;
	}

	public WebElement getExitingcustm() {
		return exitingcustm;
	}

	public WebElement getOurcompanybtn() {
		return ourcompanybtn;
	}

	public WebElement getCreatcustomerbtn() {
		return creatcustomerbtn;
	}
}
