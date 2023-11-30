package again_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class again_windo_handle {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
//String addres = driver.getWindowHandle();
//System.out.println(addres);
driver.findElement(By.xpath("//span[.='Continue with Google']")).click();
driver.findElement(By.id("apple-signin-button")).click();
Set<String> alladre = driver.getWindowHandles();
int c = alladre.size();
System.out.println(c);
for(String all:alladre)
{
	driver.switchTo().window(all);
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
}
	}

}
