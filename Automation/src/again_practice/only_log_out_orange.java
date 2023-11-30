package again_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.fb.generic.orange;

public class only_log_out_orange {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		orange o=new orange();
		Reporter.log("login",true);
		driver.get(o.getpropertydata("URL"));
		driver.findElement(By.name("username")).sendKeys(o.getpropertydata("UN"));
		driver.findElement(By.name("password")).sendKeys(o.getpropertydata("PW"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
        
	}driver.findElement(By.linkText("Logout")).click();

}
