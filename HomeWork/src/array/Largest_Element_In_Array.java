package array;

public class Largest_Element_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,54,6,5,85,25,325,45,54};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println(max);

	}

}
