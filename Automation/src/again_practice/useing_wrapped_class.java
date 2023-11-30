package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class useing_wrapped_class {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
		WebElement all = driver.findElement(By.id("mtr"));
		Select s=new Select(all);
		WebElement allop = s.getWrappedElement();
		String text = allop.getText();
		System.out.println(text);
	}

}
