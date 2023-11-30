package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class compare_zender_button_porperly_align_or_not {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		int r1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int r2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int r3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		if(r1==r2&&r2==r3)
		{
			System.out.println("properly aligns and pass");
		}
		else
		{
			System.out.println("not properly aligns and fail");
		}
		driver.quit();
	}

}
