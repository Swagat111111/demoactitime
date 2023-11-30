package again_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_alert_popup_in_qspider_app {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://demoapps.qspiders.com/browser");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//p[text()='Alert Button Clicked']")).getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(1000);
		Alert b = driver.switchTo().alert();
		b.dismiss();
		Thread.sleep(1000);
		String text1 = driver.findElement(By.xpath("//p[text()='You selected Cancel']")).getText();
		System.out.println(text1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Alert c = driver.switchTo().alert();
		c.sendKeys("yes");
		c.accept();
		String text2 = driver.findElement(By.xpath("//p[text()='You selected yes']")).getText();
         System.out.println(text2);
         driver.quit();
	}

}
