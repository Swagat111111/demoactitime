package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class how_to_get_html {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        String htmlCode=driver.getPageSource();
        System.out.println(htmlCode);
     String s=driver.getTitle();
     System.out.println(s);
        driver.quit();
        
	}

}
