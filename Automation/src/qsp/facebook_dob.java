package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_dob {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
   driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
   WebElement Ele = driver.findElement(By.id("month"));
   Select s=new Select(Ele);
   s.selectByIndex(10);
   //System.out.println(s);
   Thread.sleep(3000);
   s.selectByValue("1");
   Thread.sleep(3000);
   s.deselectByVisibleText("Apr");
   
	}

}
