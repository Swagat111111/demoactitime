package again_practice;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class modify_scrip_for_cleartip {

	public static void main(String[] args) throws AWTException, InterruptedException  {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.cleartrip.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.findElement(By.xpath("//div[contains(@class,'px-1 ')]")).click();
driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("bangalore");
driver.findElement(By.xpath("//p[contains(text(),'Bangalore,')]")).click();
driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("goa");
driver.findElement(By.xpath("//p[contains(text(),'Goa, IN - M')]")).click();
Thread.sleep(3000);
WebElement element = driver.findElement(By.xpath("//div[contains(@style,'background: rgb(255, 241')]"));
Actions a=new Actions(driver);
a.scrollToElement(element).perform();
driver.findElement(By.xpath("//div[contains(@class,'fs-4 fw-500 c')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//div[contains(@style,'height: 45px;')])[30]")).click();
driver.findElement(By.xpath("//span[text()='Search flights']")).click();
	}

}
