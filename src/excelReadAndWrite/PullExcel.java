package excelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.util.Arrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class PullExcel {

    public static String path="../WebAutomation/Data_Files/FirstExcelFile.xlsx";

    public static void main(String[] args) throws Exception {
        getXlsx(path,"TS1");
    }


    public static void getXlsx(String fileName,String sheetName) throws Exception {
     try {


         FileInputStream fileInputStream = new FileInputStream(fileName);

         XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
         XSSFSheet sheet = workbook.getSheet(sheetName);

         Iterator<Row> rowIterator = sheet.iterator();


         while (rowIterator.hasNext()) {
             Row row = rowIterator.next();
             Iterator<Cell> sheetIterator = row.iterator();
             while (sheetIterator.hasNext()) {
                 Cell cell = sheetIterator.next();

                 if (cell.getCellType() == CellType.STRING) {
                     System.out.print(cell.getStringCellValue()+"  ");

                 } else if (cell.getCellType() == CellType.NUMERIC) {
                     System.out.print(cell.getNumericCellValue()+"  ");
                 }

             } System.out.println();


         }
         workbook.close();
         fileInputStream.close();


     }catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }








}
