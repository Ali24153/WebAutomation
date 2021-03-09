package excelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteToExcel {

    public static String path= "../WebAutomation/Data_Files/Results.xlsx";
    public static void main(String[] args) throws IOException {

        Object[][]array={
                {"Subject", "Score", "Results"},
                {"Math", 97,"Passed"},
                {"english",79,"Passed"},
                {"Science",67,"Field"},
                {"Physics",39,"Failed"},
                {"Java",73,"Failed"}


        };



        WriteIntoXlsx(path,"InsertedDT",array);
    }




    public static void WriteIntoXlsx(String fileName, String sheetName, Object[][]arr) throws IOException {


        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);

        int rowNum=0;
        for (Object [] f : arr){
            Row row = sheet.createRow(rowNum++);{
                int colNum=0;
                for (Object dt : f ){
                    Cell cell= row.createCell(colNum++);
                    if (dt instanceof String){
                        cell.setCellValue((String) dt);

                    }else if (dt instanceof Integer){
                        cell.setCellValue((Integer)dt);
                    }

                    }
                    }
                }
        FileOutputStream fileOutputStream= new FileOutputStream(fileName);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
            }
        }






