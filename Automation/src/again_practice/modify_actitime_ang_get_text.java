package again_practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class modify_actitime_ang_get_text {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		driver.get("https://demo.actitime.com/login.do;jsessionid=AA8B6FC4B5E5DC4A11A4D18EB18D4420");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		Thread.sleep(3000);
		Set<String> alwh = driver.getWindowHandles();
		Iterator <String>i=alwh.iterator();
		while(i.hasNext())
		{
			String all=i.next();
			driver.switchTo().window(all);
			String title = driver.getTitle();
			System.out.println(title);
			String link="actiTIME Online Terms of Service";
			if(title.equals(link))
			{
				List<WebElement> alltext = driver.findElements(By.xpath("//h2"));
				Iterator <WebElement>l=alltext.iterator();
				while(l.hasNext())
				{
					WebElement o=l.next();
					String text = o.getText();
					System.out.println(text);
					
				}
			}
			if(title.equals(link))
			{
				driver.close();
			}
			if(!(title.equals(link)))
			{
				driver.close();
			}
		}
		
		
	}	
}
//for(String wh:alwh)
//{
//	driver.switchTo().window(wh);
//	String altt = driver.getTitle();
//	if(altt.contains("actiTIME Online Terms of Service"))
//	{
//		Thread.sleep(3000);
//		 List<WebElement> all = driver.findElements(By.xpath("//h2"));
//		for(WebElement a:all)
//		{
//			System.out.println(a.getText());
//		}
//		
//	}
//	
//	driver.close();
//	
//}

