package fileread;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleWrite {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("dac.txt",true);
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		String str=br.readLine();
		
		fw.write(str);
		fw.close();
		
		System.out.println("File Write is Over");
		
		while((str=br.readLine())!=null) {
			System.out.print(str);
		}
		
	}
	
}
