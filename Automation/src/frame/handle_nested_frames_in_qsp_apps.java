package frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_nested_frames_in_qsp_apps {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@qspiders.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("manager");
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        Alert a = driver.switchTo().alert();
        String text = a.getText();
        System.out.println(text);
if(text.equals("Signed Up Successfully"))
{
	System.out.println("text is showing and pass");
}
else
{
	System.out.println("text is not showing and fail");
}
a.accept();
driver.quit();
	}

}
