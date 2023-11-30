package again_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_current_url {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getCurrentUrl();
		if(title.equals("https://mail.google.com/"))
		{
			System.out.println("url is succesfully navigateing and pass");
		}
		else
		{
			System.out.println("url is not succesfully naviigeting and fail");
		}
		driver.close();
	}

}
