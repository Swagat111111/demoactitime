package data_driven_from_porperty_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class data_driven_property_file {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/qspapps.property");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("URL");
		String un=p.getProperty("UN");
		String pw=p.getProperty("PW");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
//		WebDriver driver=new ChromeDriver();
//		driver.get(url );
		

	}

}
