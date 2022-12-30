package array;

public class Number_Of_ElementsIn_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {11,54,6,5,85,25,325,45,54};
		
		System.out.println("Number of elements in array are "+arr.length);
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
