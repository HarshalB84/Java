package exception;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=200,b=3;
		int arr[]= {10,20,30,40,50};
		String s ="India";
		String st=null;
		
		
		try {
			try {
				try {
					try {
						System.out.println("Division : "+a/b);
					}catch(ArithmeticException e) {
						e.printStackTrace();
					}
					System.out.println("Index at "+arr[6]);
				}catch(ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
				}
				System.out.println("Char At"+s.charAt(8));
			}catch(StringIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			System.out.println(st.length());
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
	

	}
}