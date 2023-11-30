package again_practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_login_page_is_loaded_within_7_sec_or_not {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		try
		{
			driver.get("https://demo.actitime.com/");
			System.out.println("page is loaded within 5 sec and pass");
		}
		catch(Exception e)
		{
			System.out.println("page is not loadded in 5 sec and fail");
		}
		driver.quit();

	}

}
