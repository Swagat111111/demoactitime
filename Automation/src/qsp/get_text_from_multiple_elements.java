package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text_from_multiple_elements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Desktop/google.html");
List<WebElement> ele =  driver.findElements(By.tagName("a"));

         int count= ele.size();
         System.out.println(count);
         WebElement k = ele.get(0);
        String s = k.getText();
        System.out.println(s);
	}

}
