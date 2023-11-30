package again_practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class again_handle_file_upload_popup_in_qsp {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demoapps.qspiders.com/");
Thread.sleep(1000);
driver.findElement(By.xpath("//section[.='Popups']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//section[.='File Uploads']")).click();
Thread.sleep(1000);
File f=new File("./data/resume.docks.xlsx");
Thread.sleep(1000);
String path = f.getAbsolutePath();
Thread.sleep(1000);
driver.findElement(By.id("fileInput")).sendKeys(path);
System.out.println(path);

	}

}
