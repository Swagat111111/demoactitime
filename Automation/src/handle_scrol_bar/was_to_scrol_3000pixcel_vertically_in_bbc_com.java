package handle_scrol_bar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class was_to_scrol_3000pixcel_vertically_in_bbc_com {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bbc.com/");
JavascriptExecutor r=(JavascriptExecutor)driver;
Thread.sleep(1000);
r.executeScript("window.scrollBy(0,3000)");
	}

}
