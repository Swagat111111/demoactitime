package again_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_all_the_title_present_in_indeed_after_click_google_apple_button {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
Thread.sleep(1000);
driver.findElement(By.id("login-google-button")).click();
Thread.sleep(1000);
driver.findElement(By.id("apple-signin-button")).click();
Thread.sleep(1000);
Set<String> alladd = driver.getWindowHandles();
for(String allti:alladd)
{
	driver.switchTo().window(allti);
	Thread.sleep(1000);
	String title = driver.getTitle();
	Thread.sleep(1000);
	System.out.println(title);
	Thread.sleep(1000);
	driver.close();
}

	}

}
