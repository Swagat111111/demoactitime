package again_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_all_the_adress_present_in_indeed_after_click_google_apple_button {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
driver.findElement(By.id("login-google-button")).click();
driver.findElement(By.id("apple-signin-button")).click();
Set<String> all = driver.getWindowHandles();
int count = all.size();
System.out.println(count);
for(String alladress:all)
{
	System.out.println(alladress);
}
driver.quit();

	}

}

