package org.project.M_ProjectClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadDD {

	public static void main(String[] args) throws IOException {

		File f = new File("E:\\Java 2022\\selenium\\create login.xlsx");

		FileInputStream f1 = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(f1);
		
		Sheet s = w.getSheet("read");
		
		 Row r=  s.getRow(0);
		 
		 Cell c = r.getCell(0);
		 
		 CellType ct = c.getCellType();
		 
		 if (ct.equals(CellType.STRING)) {
			 
			 String s1 = c.getStringCellValue();
			 System.out.println(s1);
			
		}else if (ct.equals(CellType.NUMERIC)) {
			
			double s2 = c.getNumericCellValue();
			int num = (int) s2;
			System.out.println(s2);
			
		}


	
	}
	

}
