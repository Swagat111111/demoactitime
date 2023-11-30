package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_username_and_pswd_textbox_properly_align_or_not {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
int x = driver.findElement(By.id("username")).getLocation().getX();
int x1 = driver.findElement(By.name("pwd")).getLocation().getX();
if(x==x1)
{
	System.out.println("align properly and pass");
}
else
{
	System.out.println("not poperly align and fail");
}
driver.quit();
	}

}
