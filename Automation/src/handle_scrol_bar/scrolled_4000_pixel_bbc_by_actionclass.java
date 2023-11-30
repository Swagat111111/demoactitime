package handle_scrol_bar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class scrolled_4000_pixel_bbc_by_actionclass {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");
Thread.sleep(1000);
Actions a=new Actions(driver);
a.scrollByAmount(0,3000).perform();
	
}
}