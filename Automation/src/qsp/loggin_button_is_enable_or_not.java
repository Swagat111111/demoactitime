package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loggin_button_is_enable_or_not {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	boolean res=login.isEnabled();
	if(res)
		System.out.println("is enable");
	else
		System.out.println("is not enable");
	driver.quit();
}
}
