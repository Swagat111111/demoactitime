package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class copy_from_user_paste_pswd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a+c");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"a+v");
		Thread.sleep(1000);
		driver.quit();
	}

}
