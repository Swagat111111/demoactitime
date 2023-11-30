package frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_frame_in_qsp_apps {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.get("https://demoapps.qspiders.com/");
driver.findElement(By.xpath("//section[text()='Frames']")).click();
driver.findElement(By.xpath("//section[text()='iframes']")).click();
driver.switchTo().frame(0);
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("manager");
driver.findElement(By.xpath("//button[text()='Login']")).click();
Alert a = driver.switchTo().alert();
String text =a.getText();
System.out.println(text);
if(text.equals("Logged in Successfully"))
{
	System.out.println("login text is visible");
}
else
{
	System.out.println("login text is not visible");
}
	a.accept();
	driver.quit();
	}

}
