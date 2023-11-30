package for_mock_prictice;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_all_option_with_out_duplicate {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();

driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
WebElement all = driver.findElement(By.id("mtr"));
Select s=new Select(all);
List<WebElement> allop = s.getOptions();
HashSet<String>hs=new HashSet<String>();
for( WebElement text:allop)
{
	String at = text.getText();
	hs.add(at);
//	if(hs.add(at)==false)
//	{
//		System.out.println(at);
//	}
	
}
for(String alltext:hs)
{
	System.out.println(alltext);
}

{
	
}
driver.quit();
	}

}
