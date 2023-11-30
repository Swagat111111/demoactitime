package selenium_important_program;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wipro_job_text_and_url {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs"+Keys.ENTER);
Thread.sleep(1000);
List<WebElement> alltext = driver.findElements(By.xpath("//a[@jsname='UWckNb']"));
int c=alltext.size();
System.out.println(c);
Iterator<WebElement> i=alltext.iterator();
while(i.hasNext())
{
String text = i.next().getText();
String url = i.next().getAttribute("href");
System.out.println(text+"==>"+url);
	
}
//for(WebElement text:alltext)
//{
//	String textall = text.getText();
//	String url = text.getAttribute("href");
//	System.out.println(textall+"==>"+url);
//}

//for(int i=0;i<c;i++)
//{
//	String text = alltext.get(i).getText();
//	String url = alltext.get(i).getAttribute("href");
//	System.out.println(text+"==>"+url);
//}

	}

}
