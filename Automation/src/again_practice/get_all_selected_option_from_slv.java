package again_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_all_selected_option_from_slv {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
		WebElement allop = driver.findElement(By.id("slv"));
		Select s=new Select(allop);
		List<WebElement> all = s.getAllSelectedOptions();
		int count = all.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
String text = all.get(i).getText();
System.out.println(text);
		}
	}

}
