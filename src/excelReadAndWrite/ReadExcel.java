package excelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {


    public static  String  FileName="../WebAutomation/Data_Files/FirstExcelFile.xlsx";

    public static void main(String[] args) throws Exception {
        getExcelData(FileName,0);
    }





    public static void getExcelData(String file, int sheetLocation) throws Exception {

        FileInputStream fileInputStream= new FileInputStream(file);
        XSSFWorkbook workbook= new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet= workbook.getSheetAt(sheetLocation);

        Iterator<Row> rowIterator= sheet.iterator();
        while (rowIterator.hasNext()){
            Row row = rowIterator.next();

            Iterator<Cell> cellIterator= row.iterator();
            while(cellIterator.hasNext()){

                Cell cell = cellIterator.next();
                if (cell.getCellType()== CellType.NUMERIC){
                    System.out.print(cell.getNumericCellValue()+"  ");
                }else if (cell.getCellType()==CellType.STRING){
                    System.out.print(cell.getStringCellValue()+"  ");
                }
            }
            System.out.println();
            workbook.close();
            fileInputStream.close();
        }



    }









}
