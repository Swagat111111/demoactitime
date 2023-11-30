package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class compare_height_width_of_usename_paswd_of_actitime {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement e = driver.findElement(By.id("username"));
		int h1 = e.getSize().getHeight();
		int w1 = e.getSize().getWidth();
		WebElement e1 = driver.findElement(By.name("pwd"));
		int h2 = e1.getSize().getHeight();
		int w2 = e1.getSize().getWidth();
		if(h1==h2&&w1==w2)
		{
			System.out.println("both are equal and pass");
		}
		else
		{
			System.out.println("both are not equal and fail");
		}
		driver.quit();
	}

}
