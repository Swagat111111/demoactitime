package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_the_status_of_checkbox_of_actitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		boolean e = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		Thread.sleep(2000);
		if(e==true)
		{
			System.out.println("status is selected and pass");
		}
		else
		{
			System.out.println("status is no selected and fail");
		}
		driver.quit();
	}

}
