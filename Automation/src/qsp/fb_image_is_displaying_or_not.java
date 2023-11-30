package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_image_is_displaying_or_not {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement image=driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
	
	boolean res=image.isDisplayed();
	if(res)
		System.out.println("is displayed");
	else
		System.out.println("not displayed");
	driver.quit();
}
}
