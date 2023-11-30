package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_admin_and_manager_in_actitime {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
driver.get("http://localhost/");
Thread.sleep(1000);
driver.findElement(By.id("username")).sendKeys("admin");
Thread.sleep(1000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(1000);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
driver.quit();
	}

}
