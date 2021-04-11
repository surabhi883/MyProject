package com.sap.java.sampletestng;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static Object[][] getexceldata(String excelPath, String sheetName) throws IOException {
		
		DataFormatter formatter = new DataFormatter(); 
		
		XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rowcount = sheet.getPhysicalNumberOfRows();
		int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object data[][]= new Object[rowcount-1][columncount];
		for(int i=1;i<rowcount;i++) {
			for(int j=0; j<columncount; j++) {
				XSSFCell celldata = sheet.getRow(i).getCell(j);
				String data2 = formatter.formatCellValue(celldata);
				data[i-1][j]=data2;
				
			}
		}
		return data;
		
	} 
}