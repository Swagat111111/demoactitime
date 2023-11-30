package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class compare_height_width_of_actitime_login_button {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un=driver.findElement(By.id("username"));
		WebElement psw=driver.findElement(By.name("pwd"));
		int un1=un.getSize().getHeight();
		int un2=un.getSize().getWidth();
		int psw1=psw.getSize().getHeight();
		int psw2=psw.getSize().getWidth();
		
		if(un1==psw1 &&un2==psw2)
			System.out.println("pass");
		else
			System.out.println("failed");
		driver.quit();
	}

}
