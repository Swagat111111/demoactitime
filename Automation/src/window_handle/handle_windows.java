package window_handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		Set<String> alwh = driver.getWindowHandles();
		String single = driver.getWindowHandle();
		for(String wh:alwh)
		{
			driver.switchTo().window(wh);
			Thread.sleep(2000);
			if(single.equals(wh))
			{
				driver.close();
			}
			
		}

	}

}
