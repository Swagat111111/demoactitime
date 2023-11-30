package handle_scrol_bar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class wrs_to_go_the_buttom_of_the_page_of_bbc {


	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.bbc.com/");
JavascriptExecutor r=(JavascriptExecutor)driver;
Thread.sleep(1000);
r.executeScript("window.scrollTo(0,document.body.scrollHeight)");
Thread.sleep(1000);
r.executeScript("window.scrollTo(0,0)");
	}

}
