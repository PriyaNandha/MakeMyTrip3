package org.project.M_ProjectClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Complete_File {
	
	public static void complete_F() throws IOException {
		
		File f = new File("E:\\Java 2022\\selenium\\create login.xlsx");
		
		FileInputStream fo = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fo);
		
		Sheet s = w.getSheet("read");
		
		int  rowsize = s.getPhysicalNumberOfRows();
		
		for (int i = 0; i < rowsize; i++) {
			
			Row r = s.getRow(i);
			
			int cellsize = r.getPhysicalNumberOfCells();
			
			for (int j = 0; j < cellsize; j++) {
				
				Cell c = r.getCell(j);
				
				CellType ct =c.getCellType();
				
				if (ct.equals(CellType.STRING)) {
					
					System.out.print(c.getStringCellValue());
					
				} else if (ct.equals(CellType.NUMERIC)) {
					
					double d = c.getNumericCellValue();
					int a =(int) d;
					System.out.print(a);
					
				}
				System.out.print("||");
			}
			System.out.println();
		}
	}	
	
	public static void main(String[] args) throws IOException {
		complete_F();
	}

}
