package excelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadXlsx {

    public static String path="../WebAutomation/Data_Files/ReadExcel.xlsx";

    public static void main(String[] args) throws IOException {
        Object[][] array={
                {"FistName" , "LastName"},
                { "louis", "Griffen"},
                {"Stewie","Griffen"},
                {"Pete", "Obama"},
                {"Zineddine","Zidane"}

        };

        insertToXlsx(path,1,array);
    }




    public static void insertToXlsx(String pathName, int sheetNum, Object[][] arr) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet();


        int rowNum = 0;

        for (Object[] dt : arr) {
            Row row = sheet.createRow(rowNum++);

            int colNum = 0;
            for (Object data : dt) {
                Cell cell = row.createCell(colNum++);

                if (data instanceof String) {
                    cell.setCellValue((String) data);

                } else if (data instanceof Integer) {
                    cell.setCellValue((Integer) data);
                }
            }
        } FileOutputStream fileOutputStream = new FileOutputStream(pathName);

        workbook.write(fileOutputStream);


        workbook.close();
        fileOutputStream.close();

    }

    }










