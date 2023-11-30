package for_mock_prictice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_all_window_without_using_quit_method {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
driver.findElement(By.id("login-google-button")).click();
driver.findElement(By.id("apple-signin-button")).click();
Set<String> alwh = driver.getWindowHandles();
for(String wh:alwh)
{
	Thread.sleep(1000);
	driver.switchTo().window(wh);
	String title = driver.getTitle();
	Thread.sleep(1000);
	System.out.println(title);
	Thread.sleep(1000); 
	driver.close();
}
	}

}
