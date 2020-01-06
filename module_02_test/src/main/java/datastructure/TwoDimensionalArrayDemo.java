package datastructure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TwoDimensionalArrayDemo {

    /**
     * @author Jahidul Islam
     * Construct Two Dimensional array reference variable and
     * store all the data of testData.xlsx from data directory
     * You do not have to read xlsx file only the similar data need to be
     * stored in 2D Array reference variable
     * Later get those value by index and also by using any iteration process
     *
     *  */
	
	public static Workbook book;
	public static Sheet sheet;

	public static String Test_Sheet_Path = "C:\\Users\\Admin\\git\\modul_02_java_test"
			+ "\\module_02_test\\data\\testData.xlsx";
	
	public static void main(String[] args) {
		TwoDimensionalArrayDemo.getTestData("sheet1");
	}
	
	public static Object  [][]  getTestData(String sheetName) {
		try {
			FileInputStream lp = new FileInputStream(Test_Sheet_Path);
		
		book =WorkbookFactory.create(lp);
		sheet =book.getSheet(sheetName);
		Object data [][] = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i =0; i<sheet.getLastRowNum(); i++) {
			for (int k =0; k<sheet.getRow(0).getLastCellNum(); k++){
				data [i][k]=sheet.getRow(i+1).getCell(k).toString();
				System.out.println(data[i][k] + " ");
			}
		}
	
		return data;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
