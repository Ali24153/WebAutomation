package excelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class Pull {



    public static String path="../WebAutomation/Data_Files/States.xlsx";

    public static void main(String[] args) throws Exception {
        readXlsx(path,"Ranking");
    }


    public static void readXlsx(String fileName, String sheetName) throws Exception {

        FileInputStream fileInputStream=new FileInputStream(fileName);
        XSSFWorkbook workbook= new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet= workbook.getSheet(sheetName);


        Iterator<Row> rowIterator= sheet.iterator();

        while (rowIterator.hasNext()){

            Row row= rowIterator.next();


            Iterator<Cell> cellIterator= row.iterator();
            while(cellIterator.hasNext()){
            Cell cell = cellIterator.next();
            if (cell.getCellType()== CellType.STRING){

                System.out.print(cell.getStringCellValue()+ " ");
            }else  if (cell.getCellType()==CellType.NUMERIC){

                System.out.print(cell.getNumericCellValue()+ " ");
            }
            }
            System.out.println();
        }workbook.close();
        fileInputStream.close();






    }
}
