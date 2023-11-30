package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class type_java_and_find_all_sugg_and_take_last_sugg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		Thread.sleep(1000);
		int count=allsugg.size();
		System.out.println(count);
		Thread.sleep(1000);
		for(int i=0;i<count;i++)
		{
			WebElement ele=allsugg.get(i);
			String s=ele.getText();
			System.out.println(s);
		}
		
		allsugg.get(0).click();
		driver.quit();
	}


}
