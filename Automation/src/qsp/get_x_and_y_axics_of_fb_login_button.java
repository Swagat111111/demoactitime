package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_x_and_y_axics_of_fb_login_button {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement ele	=driver.findElement(By.name("login"));
	int x1 = ele.getLocation().getX();
	      int y2 = ele.getLocation().getY();
	      System.out.println(x1);
	      System.out.println(y2);
	      driver.quit();
	}

}
