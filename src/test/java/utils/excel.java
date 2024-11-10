package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;
import com.google.common.collect.Table.Cell;

public class excel {
//	static List<HashMap<String,Object>> testData = new ArrayList<HashMap<String,Object>>() ;
	static Map<String,Object> testData = new LinkedHashMap<String,Object>() ;
	
	
	public static Map getData(String sheetName, int rowNumber) throws IOException {
		
		File file=new File(System.getProperty("user.dir")+"/Files/TestExcel.xlsx");
	
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet =  wb.getSheet(sheetName.toLowerCase());
		
		int rows=sheet.getLastRowNum();
		int colms=sheet.getRow(rowNumber).getLastCellNum();
		
		for (int i=rowNumber;i<=rowNumber;i++) {
			XSSFRow row = sheet.getRow(rowNumber);
			for (int j=0;j<colms;j++) {
				XSSFCell Key = sheet.getRow(0).getCell(j);
				XSSFCell cell = row.getCell(j);
				Object value = null;
				switch (cell.getCellType()) {
				case STRING: value = cell.getStringCellValue();break;
				case NUMERIC:value = cell.getNumericCellValue();break;
				case BLANK:value=null;break;
				}
				testData.put(Key.getStringCellValue(),  value);
			}
		}
		return testData;
}
			

	public static void main(String[] args) throws IOException {
	

			String name=(String) excel.getData("Sheet1", 1).get("Name");
			Object age=  excel.getData("Sheet1", 1).get("Age");
			String browser=(String) excel.getData("Sheet1", 1).get("Browser");
			System.out.println(excel.getData("Sheet1", 1));
			System.out.println(name);
			System.out.println(age);
			System.out.println(browser);
		

	}
	}
