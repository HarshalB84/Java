package multiarray;

public class SumUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int sum=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j) {
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("Sum of diagonal elements is : "+sum);
		
		int sum1=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i<j) {
					sum1=sum1+a[i][j];
				}
			}
		}
		System.out.println("Sum of Upper Triangular matrix element is : "+sum1);
		
		int sum2=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i>j) {
					sum2=sum2+a[i][j];
				}
			}
		}
		System.out.println("Sum of Lower Triangular matrix element is : "+sum2);
	}

}
