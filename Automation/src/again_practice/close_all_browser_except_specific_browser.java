package again_practice;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_all_browser_except_specific_browser {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the title");
		String sagar=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		Thread.sleep(1000);
		driver.findElement(By.id("login-google-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(1000);
		Set<String> awh = driver.getWindowHandles();
		Thread.sleep(1000);
		for(String all:awh)
		{
			driver.switchTo().window(all);
			Thread.sleep(1000);
			String title = driver.getTitle();
			Thread.sleep(1000);
			if(title.contains(sagar))
			{
				Thread.sleep(1000);
				driver.close();
			}
		}

	}

}
