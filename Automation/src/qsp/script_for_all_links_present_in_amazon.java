package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_for_all_links_present_in_amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		int count = ele.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement k=ele.get(i);
			String s=k.getText();
			System.out.println(s);		
			
		}
		driver.quit();

	}

}
