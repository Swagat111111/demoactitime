package again_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_all_sugg_of_flipkart_by_write_iphone {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.name("q")).sendKeys("iphone");
Thread.sleep(1000);
List<WebElement> all = driver.findElements(By.xpath("//div[contains(@class,'YGcVZO _2VHNef')]"));
int count = all.size();
System.out.println(count);
for(WebElement allsug:all)
{
System.out.println(allsug.getText());
}
	}

}
