package again_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_all_links_text {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		Thread.sleep(1000);
		int count=allLinks.size();
		Thread.sleep(1000);
		System.out.println(count);
		Thread.sleep(1000);
		//String text = allLinks.get(0).getText();
		WebElement link = allLinks.get(0);
		Thread.sleep(1000);
		String text = link.getText();
		Thread.sleep(1000);
		System.out.println(text);
driver.quit();
	}

}
