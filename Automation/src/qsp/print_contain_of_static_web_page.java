package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_contain_of_static_web_page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Documents/java.html");
		List<WebElement> ele = driver.findElements(By.xpath("//td"));
		Thread.sleep(1000);
           int count=ele.size();
           Thread.sleep(1000);
           System.out.println(count);
            for(int i=0;i<count;i++)
           {
	         WebElement take = ele.get(i);
	         Thread.sleep(1000);
	        String s= take.getText();
	        Thread.sleep(1000);
	        System.out.println(s);
             }
          driver.quit();  
	}

}
