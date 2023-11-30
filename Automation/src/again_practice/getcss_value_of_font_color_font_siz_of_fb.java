package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcss_value_of_font_color_font_siz_of_fb {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement c1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String color = c1.getCssValue("color");
		String size = c1.getCssValue("font-size");
		String family = c1.getCssValue("font-family");
		System.out.println(color);
		System.out.println(size);
		System.out.println(family);
		driver.quit();
	}

}
