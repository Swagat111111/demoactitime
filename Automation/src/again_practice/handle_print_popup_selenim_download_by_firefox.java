package again_practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handle_print_popup_selenim_download_by_firefox {

	public static void main(String[] args) throws InterruptedException, AWTException {
WebDriver driver=new FirefoxDriver();
driver.get("https://www.selenium.dev/downloads/");
Thread.sleep(1000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_P);
Thread.sleep(1000);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(1000);
r.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(1000);
for(int i=0;i<4;i++)
{
	r.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
}
r.keyPress(KeyEvent.VK_1);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_MINUS);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_4);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_Y);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_ENTER);
driver.quit();
	}

}
