package data_driven_by_excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class again_read_data_from_exel {

	public static void main(String[] args) throws Exception{
FileInputStream fis=new FileInputStream("./data/sagarcompany.xlsx");
Workbook wb = WorkbookFactory.create(fis);
String data=wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
System.out.println(data);


	}

}
