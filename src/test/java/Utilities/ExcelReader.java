package Utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelReader {

    public static String getExcelData(int row, int column) {
        String result="";
        try {
            FileInputStream file = new FileInputStream("src/test/java/Utilities/Files/Excel.xlsx");
            XSSFWorkbook xcelDoc = new XSSFWorkbook(file);
            XSSFSheet Sheet1 = xcelDoc.getSheet("Sheet1");
            result = Sheet1.getRow(row - 1).getCell(column - 1).getStringCellValue();
        } catch (Exception e){  }
        return result;
    }

}
