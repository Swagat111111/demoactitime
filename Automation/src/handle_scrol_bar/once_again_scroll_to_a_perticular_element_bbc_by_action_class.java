package handle_scrol_bar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class once_again_scroll_to_a_perticular_element_bbc_by_action_class {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	WebElement element = driver.findElement(By.xpath("//span[text()='More around the BBC']"));
	Actions a=new Actions(driver);
	a.scrollToElement(element).perform();
	
}
}
