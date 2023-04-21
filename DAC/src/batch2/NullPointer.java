package batch2;

public class NullPointer {

	public static void main(String[] args) {
		
		int a=0;
		
		try {
			String b=null;
			System.out.println(b.length());
			
		}catch(Exception e ) {
			e.printStackTrace();
			
			System.out.println("value cannot be null");
		}
		
		
		

	}

}
