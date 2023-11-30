package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainlogin {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/");
Thread.sleep(2000);
login l=new login(driver);
l.setlogin("admin1", "manager");
Thread.sleep(2000);
l.setlogin("admin", "manager");
driver.close();
	}

}
