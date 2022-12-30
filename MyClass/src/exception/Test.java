package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
	
	static void readFileData() throws IOException {
		
		FileInputStream fis = new FileInputStream("D://File.txt");
		
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}System.out.println();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		readFileData();
		System.out.println("Done");
		
	}

}
