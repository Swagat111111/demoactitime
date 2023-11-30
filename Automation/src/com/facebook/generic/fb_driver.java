package com.facebook.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_driver {

	public static void main(String[] args) throws Exception {
		fb_generic fb=new fb_generic();
		WebDriver driver=new ChromeDriver();
		driver.get(fb.getdata("URL"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(fb.getdata("UN"));
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(fb.getdata("PW"));
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
