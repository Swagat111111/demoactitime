package data_driven_from_porperty_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class open_fb_takeing_un_pasword_from_propertyfile {

	public static void main(String[] args) throws IOException {
FileInputStream fis=new FileInputStream("./data/fb.property");
Properties p=new Properties();
p.load(fis);
String url = p.getProperty("URL");
String un = p.getProperty("UN");
String pw = p.getProperty("pw");
//System.out.println(url);
//System.out.println(un);
//System.out.println(pw);
WebDriver driver=new ChromeDriver();
driver.get(url);
driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pw);
driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
