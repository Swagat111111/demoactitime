package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_loggin_button_ {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean login = driver.findElement(By.name("login")).isEnabled();
		if(login==true)
		{
			System.out.println("fb login button is enable and pass");
		}
		else
		{
			System.out.println("fb login button is disable and fail");
		}
		driver.quit();

	}

}
