package handle_disable_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class write_admin_int_textbox_and_write_manger_in_disable_text_box {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/disabled.html");
driver.findElement(By.id("d1")).sendKeys("admin");
RemoteWebDriver r=(RemoteWebDriver) driver;
Thread.sleep(1000);
r.executeScript("document.getElementById('d2').value='manager'");
Thread.sleep(1000);
driver.quit();
	}

}
