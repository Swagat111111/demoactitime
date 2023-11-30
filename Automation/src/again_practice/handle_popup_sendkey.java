package again_practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_popup_sendkey {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
Thread.sleep(5000);
Alert a = driver.switchTo().alert();
Thread.sleep(5000);
a.sendKeys("sagar swagat sahoo");
Thread.sleep(5000);
a.accept();
	}

}
