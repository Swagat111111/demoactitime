package qsp;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class file_upload_pop_ups {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Documents/file%20upload.html");
File f=new File("/Automation/src/copy/potential delete and restore_-123.xlsx");
String s=f.getAbsolutePath();
System.out.println(s);
//driver.findElement(By.id("cv")).sendKeys(s);
	}

}
