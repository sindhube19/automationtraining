package com.automationtraining.utilities;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.automationtraining.constant.ConstantFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public class ExcelUtilities {

	private static File file;
    private static FileInputStream inputStream;
    protected static Workbook workbook;
   
    private static Sheet sheet;
    private static Row row;
    private static Cell cell;
 
    private static int totalRows = 0;
    private static int totalCols = 0;


	public static void openstream() throws Exception
	{
		
		file = new File(ConstantFile.testDataExcelFileName);
		
        inputStream = new FileInputStream(file);
     
        String fileExtensionName = ConstantFile.testDataExcelFileName.substring(ConstantFile.testDataExcelFileName.indexOf("."));
    
 
        if (fileExtensionName.equals(".xlsx")) {
            workbook = new XSSFWorkbook(inputStream);
           
           
        } else if (fileExtensionName.equals(".xls")) {
            workbook = new HSSFWorkbook(inputStream);
           
       
        }
        
       
	}
	
	public static void closeStream() throws IOException {
		inputStream.close();
	}

	public static String readExcel(String sheetname,String TcName,String fieldname) throws Exception
	{
	//	openstream();
	
		
		Object result =new Object();
		
		try{
			
		sheet = workbook.getSheet(sheetname);

		totalRows = sheet.getLastRowNum();
		row = sheet.getRow(0);
		totalCols = row.getLastCellNum();

		for (int k = 1; k <= totalRows; k++) {
			String testCaseID = sheet.getRow(k).getCell(0).getStringCellValue();

			if (testCaseID.equalsIgnoreCase(TcName)) {
				for (int l = 1; l < totalCols; l++) {

					String testData_FieldName = sheet.getRow(0).getCell(l).getStringCellValue();

					if (testData_FieldName.equalsIgnoreCase(fieldname)) {
						cell = sheet.getRow(k).getCell(l);
						if (cell != null) {
							switch (cell.getCellType()) {
							case Cell.CELL_TYPE_NUMERIC:// numeric value in excel
								if (DateUtil.isCellDateFormatted(cell)) {
									Date myDate = cell.getDateCellValue();
									SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
									result = formatter.format(myDate);
								} else {
									result = new BigDecimal(cell.getNumericCellValue()).toPlainString();
								}
								break;

							case Cell.CELL_TYPE_STRING: // string value in excel
								result = cell.getStringCellValue();
								break;

							case Cell.CELL_TYPE_BOOLEAN: // boolean value in excel
								result = cell.getBooleanCellValue();
								break;

							case Cell.CELL_TYPE_BLANK: // blank value in excel
								result = cell.getStringCellValue();
								break;

							case Cell.CELL_TYPE_ERROR: // Error value in excel
								result = cell.getErrorCellValue() + "";
								break;
							}
						}
					}
							}
			//	k = totalRows + 1;
			}
		}
		}
		catch(Exception ex) {
			throw ex;
		}
		/*if(result==null)
			result = new Object();*/

		return result.toString();
	}
	
}





