package com.orange.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class orange_generic  {
public String getproperti(String key)throws Exception
{
	FileInputStream fis=new FileInputStream("./data/orange.property");
	Properties p=new Properties();
	p.load(fis);
	 String data = p.getProperty(key);
	 return data;
}

	
}

