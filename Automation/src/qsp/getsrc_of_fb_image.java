package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsrc_of_fb_image {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement ele=driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
String s=ele.getAttribute("src");
System.out.println(s);
driver.quit();
	}

}
