package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autometic_scenario {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(1000);
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(1000);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
Thread.sleep(1000);
driver.quit();
	}

}
