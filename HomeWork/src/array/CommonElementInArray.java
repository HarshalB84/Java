package array;

public class CommonElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {12, 23, 34, 67 ,78, 91, 56};
		int arr2[] = {39, 25, 15, 23, 55, 91, 66, 22};
		
		System.out.println("Common element are : ");
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr2[j]+" ");
				}
			}
		}
		
		
	}

}
