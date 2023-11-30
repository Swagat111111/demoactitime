package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_1st_selected_option_in_slv {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
		WebElement allop = driver.findElement(By.id("slv"));
Select s=new Select(allop);
WebElement fst = s.getFirstSelectedOption();
String text = fst.getText();
System.out.println(text);
	}

}
