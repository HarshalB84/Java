package array;

public class ContinueMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,5,8,10};
		int j=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=j) {
				System.out.println(j);
				i--;
			}
			j++;
		}

	}

}
