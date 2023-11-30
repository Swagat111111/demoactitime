package handle_disable_element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class delete_text_from_disable_element {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/disabled.html");
driver.findElement(By.id("d1")).sendKeys("admin");
JavascriptExecutor r=(JavascriptExecutor)driver;
r.executeScript("document.getElementById('d2').value='manager'");
Thread.sleep(1000);
r.executeScript("document.getElementById('d2').value=''");
	}

}
