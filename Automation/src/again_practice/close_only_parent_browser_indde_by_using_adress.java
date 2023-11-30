package again_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_only_parent_browser_indde_by_using_adress {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
driver.findElement(By.id("login-google-button")).click();
driver.findElement(By.id("apple-signin-button")).click();
String add = driver.getWindowHandle();
Set<String> adress = driver.getWindowHandles();
for(String sepa:adress)
{
	driver.switchTo().window(sepa);
	if(sepa.equals(add))
	{
		driver.close();
	}
}
	}

}
