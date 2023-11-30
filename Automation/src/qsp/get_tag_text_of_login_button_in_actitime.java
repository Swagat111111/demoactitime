package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_tag_text_of_login_button_in_actitime {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele=driver.findElement(By.id("loginButton"));
		String s=ele.getText();
		System.out.println(s);
driver.quit();
	}

}
