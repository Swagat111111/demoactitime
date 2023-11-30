package again_practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_file_upload_popup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Desktop/cv.html");
		File f=new File("./data/resume.docks.xlsx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(path);
		System.out.println(path);

	}

}
