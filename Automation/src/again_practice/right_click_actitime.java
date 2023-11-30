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

public class right_click_actitime {

	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.get("https://demo.actitime.com/login.do;jsessionid=21F8CBE10833B7533E6B09F2F2FBE9CB");
WebElement target = driver.findElement(By.linkText("actiTIME Inc."));
Actions s=new Actions(driver);
Thread.sleep(3000);
s.contextClick(target).perform();
Robot r=new Robot();
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_W);
Thread.sleep(3000);
driver.quit();
	}

}
