package again_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class print_vtiger_text_by_moving_the_mouse {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.get("https://www.vtiger.com/");
WebElement target = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
Actions a=new Actions(driver);
a.moveToElement(target).perform();
	
	driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])[1]")).click();
String text = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]")).getText();
	
System.out.println(text);
		
	driver.quit();


	}

}
