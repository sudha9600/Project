package com.omrbranch.page;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import frameworkday2.Baseclass;

	public class ExcelUtils extends Baseclass{

		public String getCellData(String sheetName, int rownum, int cellnum) throws IOException {
			File file = new File("C:\\Users\\Admin\\eclipse-workspace\\OmrBranch\\test\\NutsLogin.xlsx");
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			DataFormatter dataFormatter = new DataFormatter();
			String value = dataFormatter.formatCellValue(cell);
			return value;
		}

		public void updateCellData(String sheetName, int rownum, int cellnum, String oldData, String newData)
				throws IOException {
			File file = new File("C:\\Users\\Admin\\eclipse-workspace\\OmrBranch\\test\\NutsLogin.xlsx");
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(cellnum);
			DataFormatter dataFormatter = new DataFormatter();
			String value = dataFormatter.formatCellValue(cell);
			if (value.equals(oldData)) {
				cell.setCellValue(newData);
			}
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			workbook.write(fileOutputStream);
		}

		public void createCellData(String sheetName, int rownum, int cellnum, String data) throws IOException {
			File file = new File("C:\\Users\\Admin\\eclipse-workspace\\OmrBranch\\test\\NutsLogin.xlsx");
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.createCell(cellnum);
			cell.setCellValue(data);
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			workbook.write(fileOutputStream);
		}

	}

	

