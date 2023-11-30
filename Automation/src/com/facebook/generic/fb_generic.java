package com.facebook.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class fb_generic {
public String getdata(String key)throws Exception
{
	FileInputStream fis=new FileInputStream("./data/fb.property");
	Properties p= new Properties();
	p.load(fis);
	String data=p.getProperty(key);
	return data;
	
}

}
