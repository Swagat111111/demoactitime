package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemy_trip_handle_popup {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.makemytrip.com/");
driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	}

}
//span[@class='commonModal__close']