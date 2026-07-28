package frameworkday2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.RowId;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtils {
	
private org.apache.poi.ss.usermodel.Cell cell;

public String getCellData(String sheetname,int rownum,int cellnum) throws Exception {
	File file=new File("C:\\Users\\Admin\\eclipse-workspace\\OmrBranch\\test\\NutsLogin.xlsx");
	FileInputStream fileInputStream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(fileInputStream);
	Sheet sheet=workbook.getSheet(sheetname);
	Row row=sheet.getRow(rownum);
	 Cell cell = row.getCell(cellnum);
	 DataFormatter dataFormatter=new  DataFormatter();
	 String value=dataFormatter.formatCellValue(cell);
		return value;
}
 public void updateCellVCalue(String sheetName,int cellnum,int rownum) throws IOException {
	 File file=new File("C:\\Users\\Admin\\eclipse-workspace\\OmrBranch\\test\\NutsLogin.xlsx");
	 
	 FileInputStream fileInputStream=new FileInputStream(file);
	 Workbook workbook=new XSSFWorkbook(fileInputStream);
	 Sheet sheet=workbook.getSheet(sheetName);
	 Row row=sheet.getRow(rownum);
	 Cell cell=row.getCell(cellnum);
	 DataFormatter dataformatter=new DataFormatter();
	 String value=dataformatter.formatCellValue(cell);
	 if(value.equals(value)) {
		 cell.setCellValue(value);
		 }
FileOutputStream fileOutputStream=new FileOutputStream(file);
workbook.write(fileOutputStream);
}
 public void createCellData(String sheetName,int rownum,int cellnum,String data) throws IOException {
	 File file =new File("C:\\Users\\Admin\\eclipse-workspace\\OmrBranch\\test\\NutsLogin.xlsx");
	 FileInputStream fileInputStream=new FileInputStream(file);
	 Workbook workbook=new XSSFWorkbook(fileInputStream);
	 Sheet sheet =workbook.getSheet(sheetName);
	 Row row=sheet.getRow(rownum);
	 Cell cell=row.getCell(cellnum);
	 DataFormatter dataFormatter=new DataFormatter();
	 String value=dataFormatter.formatCellValue(cell);
	 if (value.equals(value)) {
		 cell.setCellValue(value);
		 }
	 FileOutputStream fileOutputStream=new FileOutputStream(file);
	 workbook.write(fileOutputStream);
	 }
	 
} 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 

