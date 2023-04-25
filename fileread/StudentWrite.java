package fileread;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentWrite {

	public static void main(String[] args) throws IOException {
		
		Student s1 = new Student(101, "Sahil Bhadva", 45200);
		Student s2 = new Student(102, "Rahul Bhadva", 42520);
		Student s3 = new Student(103, "Mahendra Bhadva", 49500);
		
		FileOutputStream fs = new FileOutputStream("dac");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		
		os.writeObject(s1);
		os.writeObject(s2);
		os.writeObject(s3);
		
		os.close();
		System.out.println("Object writing is done.");
		
		
	}
	
}
