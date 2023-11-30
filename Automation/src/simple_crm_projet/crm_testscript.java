package simple_crm_projet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import again_practice.select_and_deselect_all_of_mtr_list_box;

public class crm_testscript {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("http://192.168.164.128:8080/crm/HomePage.do");
driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
driver.findElement(By.id("passWord")).sendKeys("123456");
driver.findElement(By.xpath("//input[@type='image']")).click();
driver.findElement(By.linkText("Campaigns")).click();
driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
driver.findElement(By.name("property(Campaign Name)")).sendKeys("AppleMackBook");
 WebElement type = driver.findElement(By.name("property(Type)"));
 Select s=new Select(type);
 s.selectByValue("Webinar");
 driver.findElement(By.name("property(Start Date)")).sendKeys("01/12/2023");
 WebElement status = driver.findElement(By.name("property(Status)"));
 Select s1=new Select(status);
 s1.selectByValue("Active");
 driver.findElement(By.name("property(End Date)")).sendKeys("01/01/2024");
 driver.findElement(By.name("property(Expected Revenue)")).sendKeys("10,000.00");
driver.findElement(By.name("property(Budgeted Cost)")).sendKeys("5,000.00");
driver.findElement(By.name("property(Expected Response)")).sendKeys("6");
driver.findElement(By.name("property(Num sent)")).sendKeys("10");
driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}

}
