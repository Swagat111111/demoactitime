package again_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class html_page_source {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		String code = driver.getPageSource();
System.out.println(code);
driver.close();
	}

}
