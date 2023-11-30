package again_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_only_parent_browser_indde_by_using_title {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
//String specific = "Indeed";(you can use this also)
String specific = driver.getTitle();
driver.findElement(By.id("login-google-button")).click();
driver.findElement(By.id("apple-signin-button")).click();
Set<String> alltitle = driver.getWindowHandles();
for(String title:alltitle)
{
	driver.switchTo().window(title);
	String alti = driver.getTitle();
	if(!(alti.contains(specific)))
	{
		driver.close();
	}
}
	}

}
