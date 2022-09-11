package Utility_Class_Actitime;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class_Actime {

	public static String getTD(int rowindex,int coloumnindex) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Documents\\Actilogin.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
		
		String data = sh.getRow(rowindex).getCell(coloumnindex).getStringCellValue();
		return data;
	}
}
