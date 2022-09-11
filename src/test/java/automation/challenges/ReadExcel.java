package automation.challenges;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	final String excelData = "./TestData/ExcelData.xlsx";

	public void readExcelData() throws Throwable {
		// FileInputStream (it's a java class) to identify the location of the file
		// FileOutputStream (it's a java class) to write the data

		// System.out.println("this is my reuseable function" + readExcelData(1));

		FileInputStream data = new FileInputStream(excelData);
		// I am to use XSSFWorkbook class from ApachePOI to create the object and pass
		// the parameter  FileInputStream object

		XSSFWorkbook workbook = new XSSFWorkbook(data);
		// I am to use XSSFSheet object = WorkBook object to call the getSheet method
		// and passing the sheet name inside the parameter - it takes control of all the
		// sheet data

		XSSFSheet sheet = workbook.getSheet("testData");

		// itorator (coming from java utill package) - to go throw all the excel sheet
		// <Row>(coming from Apache poi)

		// I go through the itarator creating object to go through all the sheet value
		// and ignore the header using next method
		Iterator<Row> rowIterator = sheet.iterator();
		rowIterator.next();
		// Now I am to create a list of object to take control of all the data

		ArrayList<String> list = new ArrayList<String>();

		// Now I have to use any loop, but better to use while loop and passing the
		// condition
		// iterator object to call the HasNext method and I can take control of all the
		// sheet data value

		while (rowIterator.hasNext()) {

			// Finally, help with the Arraylist object, all the add method and using getCell
			// value I read the data from excel
			list.add(rowIterator.next().getCell(1).getStringCellValue());
			System.out.println(list);
		}
	}
	
	
	

}