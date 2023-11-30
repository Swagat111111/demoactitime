package data_driven_by_excel_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class write_the_data_in_exel {

	public static void main(String[] args) throws Exception{
FileInputStream fis=new FileInputStream("./data/sagarcompany.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("sagar").getRow(2).getCell(1).setCellValue("Gymson");
FileOutputStream fos=new FileOutputStream("./data/sagarcompany.xlsx");
wb.write(fos);
wb.close();
	}

}
