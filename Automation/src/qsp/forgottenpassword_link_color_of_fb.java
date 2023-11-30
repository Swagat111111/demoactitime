package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgottenpassword_link_color_of_fb {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
String c=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("color");
String c1=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-family");
String c2=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-size\r\n");
System.out.println(c);
System.out.println(c1);
System.out.println(c2);
driver.quit();

	}

}

