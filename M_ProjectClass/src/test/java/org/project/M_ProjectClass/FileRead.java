package org.project.M_ProjectClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileRead {
	
	public static String value;
	public static String file_Read(int row, int cell) throws InvalidFormatException, IOException {
		
		
		
		File f= new File("E:\\Java 2022\\selenium\\create login.xlsx");
		
		FileInputStream fo = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(f);
		
		Sheet s = w.getSheet("read");
		
		Row r = s.getRow(row);
		
		Cell c = r.getCell(cell);
		
		CellType ct = c.getCellType();
		
		if (ct.equals(CellType.STRING)) {
			
			value = c.getStringCellValue();
			
			System.out.println(value);
			
		} else if (ct.equals(CellType.NUMERIC)) {
			
			double d = c.getNumericCellValue();
			int a = (int) d;
			
			System.out.println(a);
		} 
		return value;	
	}
	
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
//		file_Read(0, 2);
	}
}
