import java.io.IOException;

import utils.excel;
import utils.propertyFile;

public class excelDataSample {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(excel.getData("Sheet1", 2));
		
		System.out.println(propertyFile.getProperty("Browser"));
	}
}
