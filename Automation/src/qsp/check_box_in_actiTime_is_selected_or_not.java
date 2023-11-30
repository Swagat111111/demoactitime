package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_box_in_actiTime_is_selected_or_not {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebElement ele=driver.findElement(By.id("keepLoggedInCheckBox"));
	ele.click();
	boolean res=ele.isSelected();
	if(res)
		System.out.println("is selected");
	else
		System.out.println("is not selected");
		driver.quit();
}
}
