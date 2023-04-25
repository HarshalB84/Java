package fileread;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class StudentRead {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream is = new FileInputStream("dac");
		ObjectInputStream os = new ObjectInputStream(is);
		
		try {
		boolean s ;
		
		while(s = (Student)os.readObject()!= null) {
			System.out.println(s);
			
		}
		}catch(EOFException e) {
			e.printStackTrace();
		}
		
	}
	
}
