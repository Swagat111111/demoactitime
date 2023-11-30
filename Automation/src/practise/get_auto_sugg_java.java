package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_auto_sugg_java {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("java");
List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(.,'java')]"));
int count = allsugg.size();
System.out.println(count);
for(WebElement sugg:allsugg)
{
	System.out.println(sugg.getText());
}
Thread.sleep(7000);
allsugg.get(0).click();

	}

}
