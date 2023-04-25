package fileread;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
		
		FileReader fr = new FileReader("dac.txt");
		
		int ch ;
		
		
		//System.out.println((char)ch);
		
		while( (ch=fr.read())!=-1) {
			System.out.print((char)ch);
		}
		
		
	}
	
}
