package shadow.dom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import again_practice.robot;

public class by_using_shadow_dom_handle_prit_pop_up_in_chrome {

	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/downloads/");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_P);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(1000);
Set<String> allw = driver.getWindowHandles();
for(String wh:allw)
{
	driver.switchTo().window(wh);
}
 SearchContext t1 = driver.findElement(By.cssSelector("print-preview-app")).getShadowRoot();
 SearchContext t2 = t1.findElement(By.cssSelector("print-preview-sidebar")).getShadowRoot();
 SearchContext t3 = t2.findElement(By.cssSelector("print-preview-button-strip")).getShadowRoot();
 t3.findElement(By.cssSelector("cr-button[class='action-button']")).click();

	}

}
