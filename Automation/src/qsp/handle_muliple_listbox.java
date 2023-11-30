package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handle_muliple_listbox {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Documents/MTR.html");
         WebElement ele = driver.findElement(By.id("mtr"));
         Select s=new Select(ele);
         Thread.sleep(3000);
         s.selectByIndex(1);
         Thread.sleep(3000);
         s.selectByValue("i");
         Thread.sleep(3000);
         s.selectByVisibleText("vadu");
         Thread.sleep(3000);
         s.deselectByIndex(1);
         Thread.sleep(3000);
         s.deselectByValue("i");
         Thread.sleep(3000);
         s.deselectByVisibleText("vadu");
        System.out.println(s.isMultiple());
         
	}

}
