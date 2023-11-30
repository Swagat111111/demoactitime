package handle_scrol_bar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_to_perticular_element_in_bbc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		Thread.sleep(1000);
		int y = driver.findElement(By.xpath("//span[text()='Future Planet']")).getRect().getY();
		JavascriptExecutor r=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		r.executeScript("window.scrollTo(0,"+y+")");
		Thread.sleep(1000);
		r.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		r.executeScript("window.scrollTo(0,0)");

	}

}
