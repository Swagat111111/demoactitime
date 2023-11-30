package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class use_of_drag_and_drop {
 
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
WebElement d1 = driver.findElement(By.xpath("//h1[contains(text(),'Block 1')]"));
WebElement d2 = driver.findElement(By.xpath("//h1[contains(text(),'Block 4')]"));
Actions a=new Actions(driver);
Thread.sleep(2000);
a.dragAndDrop(d1, d2).perform();
Thread.sleep(2000);
driver.quit();
	}

}
