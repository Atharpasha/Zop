package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multiple_Data {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
    	
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Demo1\\MULTIPLE_DATA.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	int countrow=sh.getLastRowNum();
	System.out.println("numer of rows ="+countrow);
	
	
	for(int i=1;i<=countrow-1;i++)
	{
		int countcell=sh.getRow(i).getLastCellNum();
		
		for(int j=0;j<=countcell-1;j++)
		{
			System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+"  ");
	    }
		System.out.println();
		
	  }
	
   }
}
