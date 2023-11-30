package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkwhether_radio_butto_of_fb_id_properly_aligend_or_not {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.findElement( By.xpath("(//a[contains(@role,'button')])[2]")).click();
	Thread.sleep(1000);
	int x=driver.findElement(By.xpath("//label[text()='Female']/..")).getLocation().getY();
	int x1=driver.findElement(By.xpath("//Label[text()='Male']/..")).getLocation().getY();
	int x2=driver.findElement(By.xpath("//Label[text()='Custom']/..")).getLocation().getY();
	if(x==x1&&x1==x2)
	{
		System.out.println("is propperly aligend");
	}
	else
	{
		System.out.println("is not properly aligend");
	}
	driver.quit();
}
}
