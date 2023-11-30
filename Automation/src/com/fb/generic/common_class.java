package com.fb.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class common_class {
@BeforeTest(groups={"smoke test","regression test"})
public void openbrowser()
{
	Reporter.log("openbrowser",true);
}
@BeforeMethod(groups={"smoke test","regression test"})
public void login()
{
	Reporter.log("login",true);
}
@AfterMethod(groups={"smoke test","regression test"})
public void logout()
{
	Reporter.log("logout",true);
}
@AfterTest(groups={"smoke test","regression test"})
public void closebrowser()
{
	Reporter.log("closebrowser",true);
}

	
}
