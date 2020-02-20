package my_java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadFromAFileAndWriteInAnotherFile {
    private static void readAndWrite(String src, String target) {
        try (BufferedReader reader =new BufferedReader( new FileReader(src));PrintWriter writer = new PrintWriter(target)) {
            String line = null;
            while ( (line= reader.readLine()) != null){
                writer.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        String src = "D:\\test\\modul_02_java_test\\module_02_test\\src\\main\\resources\\Key-To-Success";
        String target ="target.txt";
        readAndWrite(src, target);

    }

    /***
     * Read form a file XXXXXX write in a file YYYYYY
     *
     * */
}
