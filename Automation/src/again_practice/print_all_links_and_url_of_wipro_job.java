package again_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_all_links_and_url_of_wipro_job {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs"+Keys.ENTER);
Thread.sleep(5000);
List<WebElement> alllinks = driver.findElements(By.xpath("//a[@jsname='UWckNb']"));
int count = alllinks.size();
System.out.println(count);
for(WebElement all:alllinks)
{
	String  url= all.getAttribute("href");
	System.out.println(url);

}
	}

}
