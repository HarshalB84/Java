package day1;

public class AverageOfArray {

	public static void main(String[] args) {
		
		//calculate the average value of array elements
		
		int arr[]= {1,2,3,4,5};
		float sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		System.out.println("Average is : "+sum/arr.length);
		
		
	}

}
