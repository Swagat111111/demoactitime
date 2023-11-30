package again_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_the_text_of_all_sugg_in_google_by_write_java {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java");
Thread.sleep(1000);
List<WebElement> allsugg = driver.findElements(By.xpath("//span[text()='java']"));
int count = allsugg.size();
System.out.println(count);
//for(int i=0;i<count;i++)
//{
//	String text = allsugg.get(i).getText();
//	System.out.println(text);
//}
for(WebElement sugg:allsugg)
{
	System.out.println(sugg.getText());
	
}
allsugg.get(0).click();

	}

}
