package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class applay_html_code {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sagar/OneDrive/Documents/google.html");
	Thread.sleep(1000);
	driver.findElement(By.tagName("a")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.id("d1")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.className("c1")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.findElement(By.name("n1")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.quit();
}
}
