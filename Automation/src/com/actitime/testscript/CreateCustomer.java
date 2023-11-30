package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.file_lib;
import com.actitime.pom.HomePage;
import com.actitime.pom.taskPage;

public class CreateCustomer extends BaseClass {
@Test
public void TestCreatecustomer() throws InterruptedException, EncryptedDocumentException, IOException
{
	file_lib f=new file_lib();
	taskPage t=new taskPage(driver);
	HomePage h=new HomePage(driver);		
	h.settasktab(); 
	t.getAddnewbtn().click();
	t.getNewcustbtn().click();
	t.getCstmnametextbx().sendKeys(f.getexceldata("sahoo", 1, 2));
	t.getCstmdescriptextbox().sendKeys(f.getexceldata("sahoo", 1,3 ));
	t.getExitingcustm().click();
	t.getOurcompanybtn().click();
	t.getCreatcustomerbtn().click();
}
}
