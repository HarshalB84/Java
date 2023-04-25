package fileread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F3 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("dac.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str ;
		
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		
		
		
	}
}
