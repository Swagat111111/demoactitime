package again_practice;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_all_option_without_duplicate {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
WebElement all = driver.findElement(By.id("mtr"));
Select s=new Select(all);
HashSet<String>hs=new HashSet();
List<WebElement> allop = s.getOptions();
int count = allop.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
	String text=allop.get(i).getText();
	hs.add(text);
}
for(String alltext:hs)
{
	System.out.println(alltext);
}


	}

}
