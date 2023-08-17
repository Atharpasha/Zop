package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExceldata {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("");
	Workbook wr= WorkbookFactory.create(fis);
	Sheet shet=wr.getSheet("sheet");
	Row row=shet.getRow(0);
    Cell cel=row.getCell(0);
    String value=cel.getStringCellValue();
    FileOutputStream fos=new FileOutputStream("");
    wr.write(fos);
    wr.close();//mandatory

	}

}
