package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class type_one_plus_flipkart_take_all_sugg_take_last_one {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("one plus");
		Thread.sleep(1000);
List<WebElement> ele = driver.findElements(By.xpath("//span[contains(text(),'one plus')]"));
int count=ele.size();
Thread.sleep(1000);
System.out.println(count);
Thread.sleep(1000);

for(int i=0;i<count;i++)
{
	WebElement k = ele.get(i);
	Thread.sleep(1000);
	String s = k.getText();
	Thread.sleep(1000);
	System.out.println(s);
	Thread.sleep(1000);
}
ele.get(count-1).click();
Thread.sleep(1000);
driver.quit();
	}

	
}
