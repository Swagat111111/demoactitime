package again_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_and_deselect_all_of_mtr_list_box {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
		WebElement all = driver.findElement(By.id("slv"));
		Select s=new Select(all);
		List<WebElement> allop = s.getOptions();
		int count = allop.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			Thread.sleep(1000);
s.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--)
		{
			Thread.sleep(1000);
			s.deselectByIndex(i);
		}
	}

}
