package again_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_all_limks_and_print_1st_link_text_myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		Thread.sleep(1000);
		int count = allLinks.size();
		Thread.sleep(1000);
		System.out.println(count);
//		for(int i=0;i<count;i++)
//		{
//			WebElement links = allLinks.get(i);
//			String text = links.getText();
//			System.out.println(text);
//		}
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		driver.quit();
	}

}
