package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_all_latest_bussiness_news_present_bbc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> allnew = driver.findElements(By.xpath("//div[@class='most-popular']/div/ul/li"));
		Thread.sleep(1000);
int a = allnew.size();
System.out.println(a);
for(int i=0;i<a;i++)
{
	WebElement ok = allnew.get(i);
	Thread.sleep(1000);
	String l=ok.getText();
	Thread.sleep(1000);
	System.out.println(l);
	Thread.sleep(1000);
}
driver.quit();	}

}
