package org.automation.testingworld.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGen {

	@DataProvider(name="excel")
	public static Object[][] TestDataGenerator() throws Exception
	{
		
		FileInputStream file=new FileInputStream("./TestData/Testdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet loginsheet=workbook.getSheet("Sheet1"); 
		int numberofdata=loginsheet.getPhysicalNumberOfRows();
		Object testdata[][]=new Object[numberofdata][3];
		for(int i=0;i<numberofdata;i++)
		{
			XSSFRow row=loginsheet.getRow(i);
			XSSFCell name=row.getCell(0);
			XSSFCell email=row.getCell(1);
			XSSFCell message=row.getCell(2);
			testdata[i][0]=name.getStringCellValue();
			testdata[i][1]=email.getStringCellValue();
			testdata[i][2]=message.getStringCellValue();
		}
		
		
		
		
		return testdata;
		
	}
	

	
	
}
