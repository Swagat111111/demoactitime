package data_driven_by_excel_file;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data_read_from_excel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/seleniumtry.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String text = wb.getSheet("sagar").getRow(2).getCell(4).getStringCellValue();
	System.out.println(text);
}
}
