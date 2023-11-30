package again_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;
 
public class print_all_iphone_name_along_with_price {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.flipkart.com/");
driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
List<WebElement> alltext = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone ')]"));
int count = alltext.size();
List<WebElement> allprice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone ')]/../../div[2]/div[1]/div[1]/div[1]"));
for(int i=0;i<count;i++)
{
	String text1 = alltext.get(i).getText();
	String text2 = allprice.get(i).getText();
	System.out.println(text1+"===>>"+text2);
}
	}

}
