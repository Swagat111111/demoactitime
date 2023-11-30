package data_driven_by_excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class write_back_in_excel {

	public static void main(String[] args) throws IOException {
FileInputStream fis =new FileInputStream("./data/sagarcompany.xlsx");
Workbook wb=WorkbookFactory.create(fis);
 wb.getSheet("sagar").getRow(2).getCell(3).setCellValue("star");
FileOutputStream fos=new FileOutputStream("./data/sagarcompany.xlsx");
wb.write(fos);
wb.close();
	}

}
