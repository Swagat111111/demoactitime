package for_mock_prictice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_data_from_property_file {

	public static void main(String[] args) throws Exception {
FileInputStream fis=new FileInputStream("./data/fb.property");
Properties p=new Properties();
p.load(fis);
String url=p.getProperty("URL");
String pw=p.getProperty("pw");
String un=p.getProperty("UN");
WebDriver driver=new ChromeDriver();
driver.get(url);

	}

}
