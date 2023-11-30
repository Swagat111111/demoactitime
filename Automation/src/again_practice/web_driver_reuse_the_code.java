package again_practice;

import org.openqa.selenium.WebDriver;

public class web_driver_reuse_the_code {
		public static void TestA(WebDriver driver) 
		{
			driver.get("https://www.google.com/");
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
}