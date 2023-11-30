package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_idly_vada_dosa_and_deselect_and_chech_is_it_muli_list_box_or_not {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/OneDrive/Desktop/MTR.html");
WebElement foodlist = driver.findElement(By.id("mtr"));
Select s=new Select(foodlist);
Thread.sleep(1000);
s.selectByIndex(0);
Thread.sleep(1000);
s.selectByValue("v");
Thread.sleep(1000);
s.selectByVisibleText("dosa");
Thread.sleep(1000);
s.deselectByIndex(0);
Thread.sleep(1000);
s.deselectByValue("d");
Thread.sleep(1000);
s.deselectByVisibleText("vadu");
Thread.sleep(1000);
	}

}
//