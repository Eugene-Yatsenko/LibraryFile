package by.htp.filelibrary.runner;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;


public class MainApp2 {
	private static final String FILE_PATH = "resources/sample.txt";

	public static void main(String[] args) {	
//		Reader r = new FileReader(FILE_PATH );
//		BufferedReader br = new BufferedReader(r);
		
		try (BufferedReader br = 
				new BufferedReader(new FileReader(FILE_PATH ))){
//			String str = br.readLine();
			String str = null;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}

