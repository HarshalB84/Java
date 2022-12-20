package array;

public class EqualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,32,40,50};

		int n=a.length;
		int flag=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				flag++;
			}
		}
		if(flag==n) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		
	
	}

}