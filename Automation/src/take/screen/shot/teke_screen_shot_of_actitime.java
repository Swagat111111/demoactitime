package take.screen.shot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teke_screen_shot_of_actitime {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/");
		TakesScreenshot s=(TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
        File des =new File("./screenshot/ok.png");
        FileUtils.copyFile(src, des);
       driver.close();
	}

}
