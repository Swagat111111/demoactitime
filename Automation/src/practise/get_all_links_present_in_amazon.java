package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_all_links_present_in_amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println(count);
//		for(WebElement links:allLinks)
//		{
//			System.out.println(links.getText());
//	
//		}
for(int i=0;i<count;i++)
{
//	WebElement link = allLinks.get(i);
//	String text = link.getText();
	String text = allLinks.get(i).getText();
	System.out.println(text);
}
driver.quit();
	}

}
