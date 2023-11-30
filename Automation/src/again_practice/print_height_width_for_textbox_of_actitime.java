package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_height_width_for_textbox_of_actitime {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        WebElement e = driver.findElement(By.id("username"));
       int height = e.getSize().getHeight();
      int width = e.getSize().getWidth();
        System.out.println("height = "+height);
        System.out.println("width = "+width);
        driver.quit();
        
	}

}
