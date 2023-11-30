package for_mock_prictice;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import again_practice.select_and_deselect_all_of_mtr_list_box;

public class print_all_option_in_alphabetical_order {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
WebElement mtr = driver.findElement(By.xpath("//select[@id='mtr']"));
Select s=new Select(mtr);
List<WebElement> all = s.getOptions();
TreeSet<String>tr=new TreeSet();
Iterator<WebElement>i=all.iterator();
while(i.hasNext())
{
	String text = i.next().getText();
	tr.add(text);
}
for(String alltext:tr)
{
System.out.println(alltext);
}
	}

}
