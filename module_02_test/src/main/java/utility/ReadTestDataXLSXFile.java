package utility;

import java.io.XLSXFileReader;

public class ReadTestDataXLSXFile {

    /**
     * @author Jahidul Islam
     * 1. Using utility.XLSXFileReader class read data/testData.xlsx file
     * 2. And print values in console
     * Hints all methods required are implemented in utility.XLSXFileReader class
     * all you need to do is use thsoe methods and store XLSX file in a
     * two dimensional array, later you can get the required value from the
     * that two dimensional array.
     * !!!! That's true I did not show you exactly this but you know all the
     * necessary components of it.
     * 
     * */

	public static void main(String[] args)  {
		XLSXFileReader readXL = new XLSXFileReader();
		try {
			readXL.setExcelFile("C:\\Users\\Admin\\git\\modul_02_java_test"
					+ "\\module_02_test\\data\\testData.xlsx");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			readXL.getExcelSheetData("sheet1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}