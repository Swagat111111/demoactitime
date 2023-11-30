package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_x_and_y_axis_of_login_button_of_fb {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement d = driver.findElement(By.name("login"));
int x=d.getLocation().getX();
int y=d.getLocation().getY();
System.out.println("x = "+x);
System.out.println("y = "+y);
driver.close();

	}

}
