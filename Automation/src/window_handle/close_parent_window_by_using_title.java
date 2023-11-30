package window_handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_parent_window_by_using_title {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
 driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
 String parent = driver.getTitle();
 String apple="Apple";
 System.out.println(parent);
 driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
	driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	Set<String> alwh = driver.getWindowHandles();
	for(String al:alwh)
	{
		driver.switchTo().window(al);
		String alltitle = driver.getTitle();
		if(alltitle.contains(apple))
		{
			driver.close();
		}
	}
	}

}
