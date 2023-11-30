package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class write_char_by_char_abcd_in_t1_t2 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Documents/frame-12.html");
driver.findElement(By.id("t1")).sendKeys("SAGAR+");
driver.switchTo().frame("f1");
driver.findElement(By.id("t2")).sendKeys("CHU+");
driver.switchTo().defaultContent();
driver.findElement(By.id("t1")).sendKeys("MAMA");
WebElement f = driver.findElement(By.xpath(" //iframe"));
driver.switchTo().frame(f);
driver.findElement(By.id("t2")).sendKeys("A");
	}

}
