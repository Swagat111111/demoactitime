package for_mock_prictice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handle_notification_bar {

	public static void main(String[] args) {
ChromeOptions option=new ChromeOptions();
option.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(option);
driver.get("https://www.yatra.com/");
	}

}
