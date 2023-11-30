package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.id("APjFqb")).sendKeys("amazon");
	Thread.sleep(2000);
	driver.findElement(By.name("btnK")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a/div[1]/span")).click();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	String s=driver.getTitle();
	System.out.println(s);
	System.out.println("DADDY I NEED THIS LAPTOP PLEASE BUY FOR ME");
	driver.quit();
	
}
}
