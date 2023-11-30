package com.fb.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class generic {

	public String getpropertydata(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/fb.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	public String getexeldata(String sheetname,int row,int cell ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/sagarcompany.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public void setexeldata(String sheetname,int row,int cell,String data)throws Exception
	{
		FileInputStream fis=new FileInputStream("./data/sagarcompany.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/sagarcompany.xlsx");
		wb.write(fos);
		wb.close();
		
	}
}
