package for_mock_prictice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_all_links_present_in_amazon {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
int c = alllinks.size();
System.out.println(c);
Iterator<WebElement>i=alllinks.iterator();
while(i.hasNext())
{
	String text = i.next().getText();
	System.out.println(text);
}
driver.quit();
	}

}
