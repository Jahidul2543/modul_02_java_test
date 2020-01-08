package java.io;

import java.io.FileReader;

public class DataReader {

	public static void main(String[] args) {

		/**
		 * Use API to read the below textFile and print to console.
		 * /src/main/resources/Key-To-Success Use FileReader class, no need to store in
		 * buffer Use try....catch block to handle Exception. Use ForEach loop/while
		 * loop/Iterator to retrieve data.
		 */

		String url ="C:\\Users\\Admin\\git\\modul_02_java_test"
				+ "\\module_02_test\\src\\main\\resources\\Key-To-Success";
		DataReader.readFile(url);
	}

	public static void readFile(String filepath) {

		try {
			FileReader reader = new FileReader(filepath);
			int ch;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
			reader.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
