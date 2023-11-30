package handle_scrol_bar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class again_scroll_to_a_perticular_element_bbc {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(1000);
driver.get("https://www.bbc.com/");
int y = driver.findElement(By.xpath("//span[text()='More around the BBC']")).getRect().getY();
JavascriptExecutor r=(JavascriptExecutor)driver;
r.executeScript("window.scrollTo(0,"+y+")");

	}

}
