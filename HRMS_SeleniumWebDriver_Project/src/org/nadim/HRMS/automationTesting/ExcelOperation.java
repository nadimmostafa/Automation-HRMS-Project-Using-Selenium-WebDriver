package org.nadim.HRMS.automationTesting;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelOperation {

	public static void main(String[] args) throws BiffException, IOException {
		
		FileInputStream file  = 
				new FileInputStream("G:\\02. Automation Testing\\Automation By NareshIT\\Testing.xls");
		
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sheet = wb.getSheet(0);
		
		int rowCount = sheet.getRows();
		int cellCount = sheet.getColumns();
		
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				
				System.out.print(sheet.getCell(cellCount,rowCount).getContents());
			}
			
			System.out.println();
		}
	}
}
