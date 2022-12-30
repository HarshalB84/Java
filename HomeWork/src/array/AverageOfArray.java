package array;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,9,10};
		double average=0;int total=0;
		
		for(int i=0;i<a.length;i++) {
			total=total+a[i];
			average=total/a.length;
		}
		System.out.println(average);
		
		
	}

}
