package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class first_selected_option_in_slv {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
  driver.get("file:///C:/Users/sagar/OneDrive/Documents/MTR.html");
  WebElement ele = driver.findElement(By.id("slv"));
  Select s=new Select(ele);
  WebElement els = s.getFirstSelectedOption();
  String s1=els.getText();
  System.out.println(s1);
	}

}
