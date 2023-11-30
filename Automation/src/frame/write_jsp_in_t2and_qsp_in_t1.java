package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class write_jsp_in_t2and_qsp_in_t1 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Documents/frame-12.html");
driver.switchTo().frame(0);
driver.findElement(By.id("t2")).sendKeys("sagar");
driver.switchTo().parentFrame();
driver.findElement(By.id("t1")).sendKeys("kat");
	}

}
