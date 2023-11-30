package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main_method {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/");
login_page l=new login_page(driver);
Thread.sleep(1000);
l.setlogin("admin", "manager");
	}

}
