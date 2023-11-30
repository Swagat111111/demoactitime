package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Documents/google.html");
driver.findElement(By.cssSelector("a[id='d1']")).click();
Thread.sleep(1000);
driver.navigate().back();
driver.findElement(By.cssSelector("a[name='n1']")).click();
Thread.sleep(1000);
driver.navigate().back();
driver.findElement(By.cssSelector("a[class='c1']")).click();
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.findElement( By.cssSelector("a[href='https://www.jspiders.com/']")).click();
driver.navigate().back();
driver.quit();
	}

}
