package com.fb.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class orange_app {

	public String getpropertydata(String key) throws Exception
	{
		FileInputStream fis=new FileInputStream("./data/orange.property");
		Properties p=new Properties();
		p.load(fis);
		 String data=p.getProperty(key);
		 return data;
	}

}
