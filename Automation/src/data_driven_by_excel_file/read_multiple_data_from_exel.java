package data_driven_by_excel_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read_multiple_data_from_exel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("./data/multiple-password.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int c=wb.getSheet("sheet1").getLastRowNum();
		for(int i=1;i<=c;i++)
		{
			String un = wb.getSheet("sheet1").getRow(i).getCell(0).toString();
			System.out.println(un);
			String pw=wb.getSheet("sheet1").getRow(i).getCell(1).getStringCellValue();
			System.out.println(pw);
		}

	}

}
