package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.file_lib;
import com.actitime.pom.HomePage;
import com.actitime.pom.taskPage;
import com.fb.generic.base_class;

public class CreateProject extends BaseClass{
	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException
	{
		file_lib f=new file_lib();
		HomePage h1=new HomePage(driver);
		taskPage t1=new taskPage(driver);
		h1.settasktab();
		t1.getAddnewbtn().click();
		t1.getNewprojectbtn().click();
		t1.getProjectnametbx().sendKeys(f.getexceldata("ssproject", 1, 2));
		t1.getCustomerddbtn().click();
		Thread.sleep(1000);
		t1.getHdfc_001().click();
		t1.getProjectdesctbx().sendKeys(f.getexceldata("ssproject", 1, 3));
		t1.getCreateprojectbtn().click();
		
		
	}
}
