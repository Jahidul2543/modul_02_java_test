package my_java.io;

import java.io.FileReader;
import java.io.IOException;

public class DataReader {
    public static void read(String path) {

        try (FileReader reader = new FileReader(path)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = "D:\\test\\modul_02_java_test\\module_02_test\\src\\main\\resources\\Key-To-Success";
        read(path);

        /**
         * Use API to read the below textFile and print to console.
         * /src/main/resources/Key-To-Success
         * Use FileReader class, no need to store in buffer
         * Use try....catch block to handle Exception.
         * Use ForEach loop/while loop/Iterator to retrieve data.
         */


    }

}
