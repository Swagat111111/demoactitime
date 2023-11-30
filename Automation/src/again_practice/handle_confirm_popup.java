package again_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_confirm_popup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		a.dismiss();
		System.out.println(text);
	boolean texts = driver.findElement(By.id("demo")).isDisplayed();
if(texts==true)
{
	System.out.println("text is displayed and pass");
}
else
{
	System.out.println("texts is not displayed and failed");
}
	}

}
