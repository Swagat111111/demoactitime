package again_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class use_of_double_click_in_vtiger {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//a[contains(text(),'Resources')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		WebElement login = driver.findElement(By.id("loginspan"));
		Actions s=new Actions(driver);
		s.doubleClick(login).perform();
		String t = driver.getTitle();
		String k="Login - Vtiger";
		if(t.equals(k))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();

	}

}
