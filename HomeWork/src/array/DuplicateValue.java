package array;

public class DuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3, 10, 90, 78, 56, 10, 78, 34, 61};
		
		System.out.println("Duplicate elements are : ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[j]+" ");
				}
			}
		}
		
		
	}

}
