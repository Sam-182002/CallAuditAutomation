package com.callaudit.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	public String getStringDataFromExcel(String sheetName, int rowIndex, int cellIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
	}
	
	public void writeStringDataToExcel(String sheetName, int rowIndex, int cellIndex, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./src/test/resources/testdata/TestScriptData.xlsx");
		wb.write(fos);
		wb.close();
	}

}
