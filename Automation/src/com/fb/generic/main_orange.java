package com.fb.generic ;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orange.generic.orange_generic;

public class main_orange {

	public static void main(String[] args)throws Exception {
		orange_generic og=new orange_generic();
		og.getproperti("URL");
		WebDriver driver=new ChromeDriver();
		driver.get(og.getproperti("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(og.getproperti("UN"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(og.getproperti("PW"));
		driver.findElement(By.xpath("//button[text()=' Login ']")).submit();
	}

}
