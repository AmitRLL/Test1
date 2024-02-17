package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String parametrization(int row,int cell,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("D:\\velocity-java-eclipse\\ARLauto\\src\\test\\resources\\Book1.xlsx");
		String value = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}

}
//FileInputStream file = new FileInputStream("");
//String value = WorkBookFactory.creat(file).getSheet(sheetname).getRow(row).getcCell(cell).getStringCellValue();

