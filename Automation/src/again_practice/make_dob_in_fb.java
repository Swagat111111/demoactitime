package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class make_dob_in_fb {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		WebElement daylist = driver.findElement(By.id("day"));
		Select s=new Select(daylist);
		s.selectByValue("17");
		WebElement monthlist = driver.findElement(By.id("month"));
		Thread.sleep(1000);
		Select s1=new Select(monthlist);
		s1.selectByIndex(0);
		Thread.sleep(1000);
		WebElement yearlist = driver.findElement(By.id("year"));
		Select s2=new Select(yearlist);
		s2.selectByVisibleText("1996");
		Thread.sleep(1000);
		driver.close();
	}

}
