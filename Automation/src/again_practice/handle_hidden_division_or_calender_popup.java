package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handle_hidden_division_or_calender_popup {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
driver.findElement(By.id("policynumber")).sendKeys("123");
driver.findElement(By.id("dob")).click();

WebElement month = driver.findElement(By.className("ui-datepicker-month"));
Select s=new Select(month);
s.selectByIndex(0);
WebElement year = driver.findElement(By.className("ui-datepicker-year"));
Select s2=new Select(year);
s2.selectByValue("1996");
driver.findElement(By.xpath("(//a[@class='ui-state-default'])[17]")).click();
driver.findElement(By.id("alternative_number")).sendKeys("7008561299");
driver.findElement(By.id("renew_policy_submit")).click();
boolean text = driver.findElement(By.id("policynumberError")).isDisplayed();
if(text==true)
{
	System.out.println("text is displayed");
}
else
{
	System.out.println("text is not displayed");
}
	}

}
