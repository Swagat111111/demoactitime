package again_practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import qsp.file_upload_pop_ups;

public class handle_fileupload_popup_in_qsp {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demoapps.qspiders.com/");
driver.findElement(By.xpath("//section[text()='Popups']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
 File f=new File("./data/resume.docks.xlsx");
  String path = f.getAbsolutePath();
 driver.findElement(By.id("fileInput")).sendKeys(path);
  
  
  System.out.println(path);
	}

}
