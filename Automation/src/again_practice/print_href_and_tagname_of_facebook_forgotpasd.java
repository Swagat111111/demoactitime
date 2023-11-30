package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_href_and_tagname_of_facebook_forgotpasd {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement e = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
String tagname = e.getTagName();
String href = e.getAttribute("href");
System.out.println(tagname);
System.out.println(href);
driver.quit();

	}

}
