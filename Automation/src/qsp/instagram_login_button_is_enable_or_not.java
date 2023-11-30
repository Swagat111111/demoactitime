package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram_login_button_is_enable_or_not {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	Thread.sleep(1000);
				driver.get("https://www.instagram.com/?hl=en");
				Thread.sleep(1000);
	WebElement ele=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	Thread.sleep(1000);
	boolean b=ele.isEnabled();
	Thread.sleep(1000);
if(b)
	System.out.println("is enable");
else {
	System.out.println("is not enable");
}
driver.quit();
	}

}
