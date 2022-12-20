package multiarray;

public class SumOfRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++) {
			int sum=0;
			for(int j=0;j<3;j++) {
				sum = sum+a[i][j];
			}
			System.out.println("Addition of row elements is "+sum);
		}
		
	}

}
