package my_java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void read(String path) {

        try (BufferedReader reader =new BufferedReader( new FileReader(path))) {
             String line = null;
             while ( (line= reader.readLine()) != null){
                 System.out.println(line);
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = "D:\\test\\modul_02_java_test\\module_02_test\\src\\main\\resources\\Key-To-Success";
        read(path);
    }
    /**
     *
     *  Use BufferReader to read from buffer while reading Key-To-Success.txt from main/java/resources
     *
     * */


}
