package again_practice;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_specific_browser_from_indeed_after_clicking_google_apple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the title toclose the browser");
		String s=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> awh = driver.getWindowHandles();
		for(String wh:awh)
		{
driver.switchTo().window(wh);
String title = driver.getTitle();
if(!(title.contains(s)))
{
	driver.close();
}
		}
	}

}
