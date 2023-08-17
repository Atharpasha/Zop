package com.online_shopping_generic_library;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ExcelUtility {

	
	public String readDataFromExcel(String sheetName,int rowNo,int celNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstants.Excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		String Cellvalue=sh.getRow(rowNo).getCell(celNo).getStringCellValue();
		return Cellvalue;
		
	}
	public void writeDtaFromExcel(String sheetName,int rowNo,int celNo,String parameter) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstants.Excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		sh.getRow(rowNo).getCell(celNo).setCellValue(parameter);
		FileOutputStream fos=new FileOutputStream(IPathConstants.Excelpath);
		wb.write(fos);
		wb.close();
		
	}
	public int getLastRow(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstants.Excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int rowCount=sh.getLastRowNum();
		return rowCount;
		
	}
	public HashMap<String, String> getMultipleDataFromExcel(WebDriver driver,String sheetName,int CelKey,int CelValue) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstants.Excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int rowCount=sh.getLastRowNum();
		
		HashMap<String, String> mapp=new HashMap<String, String>();
		//fetchhing data from excel to map
		for(int i=0;i<=rowCount;i++)
		{
			String key=sh.getRow(i).getCell(CelKey).getStringCellValue();
			String value=sh.getRow(i).getCell(CelValue).getStringCellValue();
			mapp.put(key, value);	
		}
	
		return mapp;
		 
		
	}
	public Object[][]getMultipleDataByDP(String sheetname) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis=new FileInputStream(IPathConstants.Excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		int rowcount=sh.getLastRowNum();//start from zero//0//4
		System.out.println(rowcount);
		int cellcount=sh.getRow(1).getLastCellNum();//starts from 1//2
		System.out.println(cellcount);
		Object[][] obj=new Object[rowcount+1][cellcount];//coz excel matrix count is 5 and i got rowcount 4so i add 1 with it;
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				 obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		return obj;
	}
	
	
		
	
	
	
	
}
