package excelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcel {

    public static String path="../WebAutomation/Data_Files/Ali.xlsx";

    public static void main(String[] args) throws IOException {
        Object [][] array={
                {"Country" , "Capital"},
                {"USA", " W.DC"},
                {"England", "London"},
                {"Japan", "Tokyo"},
                {"France", " Paris"},
                {"Spain", "Madrid"}



        };
      Xlsx(path,"Capitals", array);
    }

    public static void Xlsx(String pathName, String sheetNum, Object[][]arr) throws IOException {


        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetNum);


        int rowNum=0;

        for (Object [] dt : arr){
          Row row =sheet.createRow(rowNum++);

          int colNum=0;

          for (Object data : dt){


              Cell cell = row.createCell(colNum++);

              if (data instanceof  String){

                  cell.setCellValue((String) data);

              }else if (data instanceof  Integer){
                  cell.setCellValue((Integer)data);
              }
          }FileOutputStream fileOutputStream = new FileOutputStream(pathName);
            workbook.write(fileOutputStream);






        }workbook.close();






    }




}
