package again_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_latest_news_of_bbc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> all = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
int count = all.size();
for(int i=0;i<count;i++)
{
	String text = all.get(i).getText();
	System.out.println(text);
}

	}

}
