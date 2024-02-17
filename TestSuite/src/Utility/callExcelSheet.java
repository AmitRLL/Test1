package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class callExcelSheet {
	public static String parametrization(int row,int cell,String sheetname) throws EncryptedDocumentException, IOException
	  {
		   FileInputStream file = new FileInputStream("D:\\Excel\\Book1.xlsx");
		   String value = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	       return value;
	   }

}
