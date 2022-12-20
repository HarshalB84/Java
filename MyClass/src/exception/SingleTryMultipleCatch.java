package exception;

public class SingleTryMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=200,b=3;
		int arr[]= {10,20,30,40,50};
		String s ="India";
		String st=null;
		
		try {
			System.out.println("Division : "+(a/b));
			System.out.println("Element at Index : "+arr[2]);
			System.out.println("Char At : "+s.charAt(2));
			System.out.println(st.length());
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e ) {
			System.out.println(e);
		}
		
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		catch(StringIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
