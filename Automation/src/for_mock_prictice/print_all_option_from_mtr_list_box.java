package for_mock_prictice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_all_option_from_mtr_list_box {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
		WebElement mtr = driver.findElement(By.xpath("//select[@id='mtr']"));
		Select s=new Select(mtr);
		List<WebElement> allop = s.getOptions();
		int c=allop.size();
		Iterator<WebElement>i=allop.iterator();
		while(i.hasNext())
		{
			String text = i.next().getText();
			System.out.println(text);
		}
	}

}
