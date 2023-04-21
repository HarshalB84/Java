package batch2;

public class ArrayIndexOutOfBoundE {

	public static void main(String[] args) {
		
		int arr [] = new int [4];
		
		try {
			System.out.println(arr[6]);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Size is not valid...!!!");
		}
		
		

	}

}