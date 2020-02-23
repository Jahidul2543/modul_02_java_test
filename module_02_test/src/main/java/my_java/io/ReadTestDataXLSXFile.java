package my_java.io;

import utility.XLSXFileReader;

public class ReadTestDataXLSXFile {

    public void read(String path) {
        XLSXFileReader reader = new XLSXFileReader();
        try {
            reader.setExcelFile(path);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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

}
