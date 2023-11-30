package window_handle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class specific_window_close {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
String parent = driver.getTitle();
Set<String> alwh = driver.getWindowHandles();
String apple="Sign in with Apple�ID";

for(String all:alwh)
{
	driver.switchTo().window(all);
	String title = driver.getTitle();
	//System.out.println(title);
	if(title.contains(apple))
	{
		driver.close();
	}
}
//while(i.hasNext())
//{
//	
//	String single = i.next();
//	driver.switchTo().window(single);
//	String alltit = driver.getTitle();
//	if(alltit.contains(apple))
//	{
//		driver.close();
//	}
//}
	}

}
