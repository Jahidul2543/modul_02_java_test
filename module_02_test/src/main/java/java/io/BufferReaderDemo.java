package java.io;



public class BufferReaderDemo {
    /**
     *
    /**
     *
     *  Use BufferReader to read from buffer while reading Key-To-Success.txt from main/java/resources
     * @throws IOException 
     * @throws FileNotFoundException 
     *
     * */
	
	public static void main(String[] args) throws IOException {
		
		String url ="C:\\Users\\Admin\\git\\modul_02_java_test"
				+ "\\module_02_test\\src\\main\\resources\\Key-To-Success";
		
		BufferReaderDemo.readFile(url);
		
	}
	
	
	
	public static void readFile (String filepath ) throws IOException {
		
		
		File f = new File(filepath);
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s =br.readLine();
		while(s!=null) {
			System.out.println(s);
			s =br.readLine();
		}
	}
	
}
