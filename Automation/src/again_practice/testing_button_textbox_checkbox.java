package again_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing_button_textbox_checkbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sagar/OneDrive/Desktop/hero.html");
//driver.findElement(By.xpath("//input[@type='text']"));//all the textbox
		//driver.findElement(By.xpath("//input[@type='button']"));//all the buttons
		//driver.findElement(By.xpath("//input[@type='checkbox']"));//all the checkbox
		driver.findElement(By.xpath("/input[@type='text' and @value='A']"));//1st checkbox
		driver.findElement(By.xpath("//input[@type='text' and @value='B']"));//only 2nd textbox
		driver.findElement(By.xpath("//input[@type='text' or@type='button']"));//all the textbox and button
		driver.findElement(By.xpath("//input[@value='A']"));//1st text and 1st button
		driver.findElement(By.xpath("//input[@type='checkbox' and @checked]"));//only selected checkbox
		driver.findElement(By.xpath("//input[@type='checkbox' and not( @checked)]"));//only unselected checkbox
	}

}
