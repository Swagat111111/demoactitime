package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class take_all_the_content_from_cosmocode {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver ();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
List<WebElement> allele = driver.findElements(By.xpath("//table[@id='countries']//td"));
int a = allele.size();
Thread.sleep(1000);
System.out.println(a);
Thread.sleep(1000);
for(int i=0;i<a;i++)
{
	WebElement ele = allele.get(i);
	
	String s = ele.getText();
	
	System.out.println(s);
}
driver.quit();
	}

}
