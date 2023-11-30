package for_mock_prictice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_all_option_and_deslect_reverse {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
WebElement mtr = driver.findElement(By.id("mtr"));
Select s=new Select(mtr);
List<WebElement> allop = s.getOptions();
for(int i=0;i<allop.size();i++)
{
	s.selectByIndex(i);
}
for(int i=allop.size()-1;i>=0;i--)
{
	s.deselectByIndex(i);
}
	}

}
