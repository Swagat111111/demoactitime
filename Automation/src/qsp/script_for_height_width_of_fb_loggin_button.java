package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_for_height_width_of_fb_loggin_button {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement login=driver.findElement(By.name("login"));
	int height=login.getSize().getHeight();
	int width=login.getSize().getWidth();
	System.out.println(height);
	System.out.println(width);
	driver.quit();
}
}
