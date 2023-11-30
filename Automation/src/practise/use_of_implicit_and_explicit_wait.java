package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class use_of_implicit_and_explicit_wait {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demo.actitime.com/");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Login ']")).click();
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.titleContains("Enter"));
String title = driver.getTitle();
System.out.println(title);
String current = driver.getCurrentUrl();
System.out.println(current);
driver.quit();


	}

}
