package qsp;

import org.openqa.selenium.WebDriver;

public class same_script_any_browser {
public static void sheela(WebDriver driver)
{
	driver.get("http://www.google.com");
	String url=driver.getTitle();
	System.out.println(url);
	driver.quit();
}
}
