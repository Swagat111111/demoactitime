package again_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_the_window_address {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
String adress = driver.getWindowHandle();
System.out.println(adress);
	}

}
