package array;

public class Smallest_Element_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {11,54,6,5,85,25,325,45,54};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println(min);
	}

}
