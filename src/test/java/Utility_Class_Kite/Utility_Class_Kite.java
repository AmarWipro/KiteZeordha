package Utility_Class_Kite;

import java.io.FileInputStream;
import java.io.FilterInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class_Kite {

	public static String getTD(int rowindex,int columnindex) throws Throwable{
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Documents\\Zeodhalogin.xlsx");
		 Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		
		String data = sh.getRow(rowindex).getCell(columnindex).getStringCellValue();
		return data;
	}
}
