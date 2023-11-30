package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class username_and_psw_textbox_of_actitime_properly_aligend_or_not {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	WebElement un=	driver.findElement(By.id("username"));
	WebElement psw=driver.findElement(By.name("pwd"));
	int x=un.getLocation().getX();
	int x1=psw.getLocation().getX();
	if(x==x1)
		System.out.println("propperly aligned");
	else
		System.out.println("not propperly aligned");
	
		driver.quit();
	}

}
