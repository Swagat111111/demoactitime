package for_mock_prictice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_suggetion {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
Thread.sleep(1000);
List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
int c=allsugg.size();
System.out.println(c);
Iterator<WebElement>i=allsugg.iterator();
while(i.hasNext())
{
	String text = i.next().getText();
	System.out.println(text);
}
driver.quit();
	
	}

}
