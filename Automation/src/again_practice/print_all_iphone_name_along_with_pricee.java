package again_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_all_iphone_name_along_with_pricee {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
List<WebElement> allname = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhon')]"));
int c = allname.size();
System.out.println(c);
List<WebElement> allprice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 1')]/../..//div[contains(@class,'_30jeq3 _1_WHN1')]"));
	for(int i=0;i<c;i++)
	{
		String text=allname.get(i).getText();
		String price=allprice.get(i).getText();
		System.out.println(text+"==>>"+price);
	}
	}

}
