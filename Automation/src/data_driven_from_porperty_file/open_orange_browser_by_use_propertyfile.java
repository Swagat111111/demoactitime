package data_driven_from_porperty_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_orange_browser_by_use_propertyfile {

	public static void main(String[] args) throws IOException, InterruptedException {
FileInputStream fis=new FileInputStream("./data/orange.property");
Properties p=new Properties();
p.load(fis);
String url=p.getProperty("URL");
String un= p.getProperty("UN");
String pw= p.getProperty("PW");
WebDriver driver=new ChromeDriver();
driver.get(url);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

}
