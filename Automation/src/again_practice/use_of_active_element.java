package again_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class use_of_active_element {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do;jsessionid=17EAE172B7EC43598A01BC211FC7E5D1");
driver.switchTo().activeElement().sendKeys("admin");
	}

}
