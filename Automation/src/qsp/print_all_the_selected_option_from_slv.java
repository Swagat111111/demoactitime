package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_all_the_selected_option_from_slv {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Documents/MTR.html");
        WebElement ele = driver.findElement(By.id("slv"));
        Select s=new Select(ele);
       List<WebElement> k = s.getAllSelectedOptions();
       int count=k.size();
       for(int i=0;i<count;i++)
       {
    	   WebElement m = k.get(i);
    	   String s1=m.getText();
    	   System.out.println(s1);
       }
	}

}
