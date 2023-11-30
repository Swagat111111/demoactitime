package again_practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_tab_in_actitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com/login.do;jsessionid=99E54033D721BA88921E05E1881ED147");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> alwh = driver.getWindowHandles();
		int c = alwh.size();
		System.out.println(c);
		for(String wh:alwh)
		{
			System.out.println(wh);
			Thread.sleep(3000);
			driver.switchTo().window(wh);
			driver.close();
			Thread.sleep(3000);
		}


	}

}
