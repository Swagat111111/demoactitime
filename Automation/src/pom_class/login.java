package pom_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
WebElement untbx;
WebElement pwtbx;
WebElement lgbtn;
login(WebDriver driver)
{
	untbx=driver.findElement(By.id("username"));
	pwtbx=driver.findElement(By.name("pwd"));
	lgbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
}

public void setlogin (String un,String pw)
{
	untbx.sendKeys("un");
	pwtbx.sendKeys("pw");
	lgbtn.click();
}
	
}

