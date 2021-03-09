package excelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {

    public static String path="../WebAutomation/Data_Files/States.xlsx";
    public static void main(String[] args) throws IOException {
        Object[][]array={

                { "State", "Capital", "Number"},
                {"Georgia", "Atlanta", 1},
                {"Ohio", "Columbus", 2}
        };
        insert(path,"Ranking",array);
    }


    public static void insert(String fileName, String sheetName, Object [][]ar) throws IOException {


        XSSFWorkbook workbook= new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet(sheetName);


        int rowNum=0;

        for (Object [] s: ar){

            Row row= sheet.createRow(rowNum++);
            int colNum=0;

            for (Object data: s){
                Cell cell=row.createCell(colNum++);
                if (data instanceof String){

                    cell.setCellValue((String) data);

                }else if (data instanceof Integer){

                    cell.setCellValue((Integer)data);
                }
            }
        }
        FileOutputStream fileOutputStream= new FileOutputStream(fileName);
        workbook.write(fileOutputStream);
       workbook.close();
        fileOutputStream.close();






    }
}
