package for_mock_prictice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_data_from_exel {

	public static void main(String[] args) throws IOException {
FileInputStream fis=new FileInputStream("./data/seleniumtry.xlsx");
Workbook wb = WorkbookFactory.create(fis);
 String data = wb.getSheet("sagar").getRow(2).getCell(4).getStringCellValue();
 System.out.println(data);
	}

}
