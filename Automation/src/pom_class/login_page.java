package pom_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_page {
WebElement untbx;
WebElement pwtbx;
WebElement lgnbtn;
login_page(WebDriver driver)
{
	untbx=driver.findElement(By.id("username"));
	pwtbx=driver.findElement(By.name("pwd"));
	lgnbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
}
public void setlogin(String un,String pw)
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgnbtn.click();
}
}
