package again_practice;

//import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_all_option_in_alphabetical_order {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
     WebElement all = driver.findElement(By.id("mtr"));
     Select s=new Select(all);
     List<WebElement> allop = s.getOptions();
     int count = allop.size();
     System.out.println(count);
     TreeSet<String> al=new TreeSet<String>();
     for(int i=0;i<count;i++)
     {
    	 String text = allop.get(i).getText();
    	 al.add(text);
     }
     for(String alltext:al)
     {
    	 System.out.println(alltext);
     }
     driver.quit();
	}

}
