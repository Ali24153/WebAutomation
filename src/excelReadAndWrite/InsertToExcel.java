package excelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InsertToExcel {

    public static String xlsxfile="../WebAutomation/Data_Files/Test.xlsx";

    public static void main(String[] args) throws IOException {
        Object[][]arry={
                {"FirstName", "LastName", "StID", "Country"},
                { "Mike","Odier",101, "USA"},
                {"Carla","Biggs",102, "Mexico"},
                {"Amar","Tadjedit",100,"Algeria"}
        };
        getXlsxData(xlsxfile,"TestResult",arry);
    }


    public static void getXlsxData(String file_name, String sheet_Name, Object[][]array ) throws IOException {
        // Create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        // Create a sheet within workbook
        XSSFSheet sheet = workbook.createSheet(sheet_Name);
        int rowNum=0;
        for (Object [] dt : array){

            // create Rows
            Row row= sheet.createRow(rowNum++);
            int colNum=0;
           for(Object single : dt){

               // Create columns
               Cell cell=row.createCell(colNum++);
               if(single instanceof String){
                  cell.setCellValue((String) single);
               }else if (single instanceof Integer){
                   cell.setCellValue((Integer) single);
               }
           }



        }System.out.println("File Created");
        try {


            FileOutputStream fileOutputStream = new FileOutputStream(file_name);
            workbook.write(fileOutputStream);
            workbook.close();
            fileOutputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}