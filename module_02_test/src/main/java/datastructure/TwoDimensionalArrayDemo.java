package datastructure;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TwoDimensionalArrayDemo {
    public static String PATH = "test.xlsx";

    public void read(String sheetName) {
        try (FileInputStream input = new FileInputStream(PATH)) {
            Workbook workbook = WorkbookFactory.create(input);
            Sheet sheet = workbook.getSheet(sheetName);
            int row = sheet.getLastRowNum()+1;
            int col = sheet.getRow(0).getLastCellNum();
            String[][] data = new String[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    data[i][j] = sheet.getRow(0).getCell(col).toString();
                }
            }


        } catch (IOException | InvalidFormatException e) {
            e.printStackTrace();
        }
    }
    /**
     * @author Jahidul Islam
     * Construct Two Dimensional array reference variable and
     * store all the data of testData.xlsx from data directory
     * You do not have to read xlsx file only the similar data need to be
     * stored in 2D Array reference variable
     * Later get those value by index and also by using any iteration process
     *
     *  */
}
