package fileread;

import java.io.FileWriter;
import java.io.IOException;

public class File1 {

	// 1. Create a file  2. Write data into file  3.Read data from file  4.Display data 
	
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("dac.txt");
		
		String str1 = "Welcome to CDAC-Acts";
		String str2 = "Welcome to Stanza Lisbon House";
		
		String str = str1+"\n"+str2;
		
		fw.write(str);
		fw.close();
		
		System.out.println("Data inserted");

		
	}
	
}