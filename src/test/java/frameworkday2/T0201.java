package frameworkday2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T0201 {

	public static void main(String[]args) throws IOException {
		//mention excel path
File file=new File("C:\\Users\\Admin\\OneDrive\\Documents\\subject.xlsx");
//Get object from fileInputStream
FileInputStream fileInputStream= new FileInputStream(file);
//Create object to the file to read
Workbook workBook=new XSSFWorkbook(fileInputStream);
//Get the sheet
Sheet sheet=workBook.getSheet("Sheet1");
//Get th Row
Row row=sheet.getRow(3);
//GEt the cell
Cell cell=row.getCell(1);
System.out.println(cell);
int Count=row.getPhysicalNumberOfCells();
System.out.println(Count);
for(int i=0;i<row.getPhysicalNumberOfCells();i++) {
	Cell call=row.getCell(i);
	System.out.println(call);
	int count=sheet.getPhysicalNumberOfRows();
	System.out.println(count);
	int count1=row.getPhysicalNumberOfCells();
	System.out.println(count1);
Cell cell1=row.getCell(1);
DataFormatter dataFormatter=new DataFormatter();
String value=dataFormatter.formatCellValue(cell1);
if(value.equals("Sri")){
cell.setCellValue("Vimal");	
	FileOutputStream fileOutputStream=new FileOutputStream(file);
	workBook.write (fileOutputStream);
	System.out.println("done");
	
	
	
}}	
	
	}
}



