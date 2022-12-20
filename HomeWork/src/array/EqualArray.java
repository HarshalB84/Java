package array;

public class EqualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {12, 22, 32, 42, 52, 62}; 
		int arr2[] = {52, 22, 62, 12, 42, 22};
		
		int flag=0;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					flag++;
				}
			}
		}
		if(flag==arr1.length) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		
		
		
	}

}
