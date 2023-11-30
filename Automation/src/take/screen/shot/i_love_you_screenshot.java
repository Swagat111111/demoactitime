package take.screen.shot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fb.generic.orange;
import com.google.j2objc.annotations.Property;

public class i_love_you_screenshot {

	public static void main(String[] args)  {
WebDriver driver=new ChromeDriver();
driver.get("https://google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("i love you");
TakesScreenshot t=(TakesScreenshot) driver;
File src = t.getScreenshotAs(OutputType.FILE);
  File dsn=new File("./ok/sagarlove.png");
try {
	FileUtils.copyFile(src, dsn);
} catch (IOException e) {
	
}
driver.close();
}

}
