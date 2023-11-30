package again_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_sugg_of_flpkart_by_oneplus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("one plus");
		Thread.sleep(1000);
		List<WebElement> allsug = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		Thread.sleep(1000);
         int count = allsug.size();
         System.out.println(count);
//         for(int i=0;i<count;i++)
//         {
//        	 String text = allsug.get(i).getText();
//        	 String text = sugg.getText();
//        	 System.out.println(text);
//         }
         for(WebElement sugg:allsug)
         {
        	 System.out.println(sugg.getText());
         }
         allsug.get(count-1).click();
         Thread.sleep(1000);
         driver.quit();
	}

}
