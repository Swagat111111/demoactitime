package again_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class use_of_double_click_in_qsp_apps {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		WebElement click = driver.findElement(By.xpath("//button[contains(text(),'5')]"));
		Actions s=new Actions(driver);
		s.doubleClick(click).perform();
		boolean text = driver.findElement(By.xpath("//span[contains(text(),'You selected \"5\"')]")).isDisplayed();
		if(text==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
	}

}
