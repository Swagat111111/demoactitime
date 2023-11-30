package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class custom_wait_example {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	int i=0;
	while(i<=20)
	{
		try
		{
			driver.findElement(By.id("logoutLink")).click();
			break;
		}
		catch(Exception e)
		{
			
		}
		i++;
	}
	driver.quit();

	}

}
