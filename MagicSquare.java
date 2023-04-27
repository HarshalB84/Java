package dsa;

// 2 7 6
// 9 5 1
// 4 3 8

public class MagicSquare {

	public static void main(String[] args) {

		int arr[][] = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
		int n = arr.length;

		int majorDiagonalSum = 0;
		int minorDiagonalSum = 0;
		int rowSum = 0;
		int columnSum = 0;
		int flag = 0;
		int firstRowSum = 0;

		for (int i = 0; i < n; i++) {
			firstRowSum += arr[0][i];
		}
		for (int i = 0; i < arr.length; i++) {
			majorDiagonalSum += arr[i][i];
			minorDiagonalSum += arr[i][n - 1 - i];

		}
		System.out.println(majorDiagonalSum + " " + minorDiagonalSum);
		if (minorDiagonalSum == firstRowSum && majorDiagonalSum == firstRowSum) {

			for (int i = 0; i < arr.length; i++) {
				rowSum = columnSum = 0;
				for (int j = 0; j < arr.length; j++) {
					rowSum += arr[i][j];
					columnSum += arr[j][i];
				}
				System.out.println(rowSum + " " + columnSum);
				if (rowSum != firstRowSum || columnSum != firstRowSum) {
					flag = 1;
					break;
				}
			}

		} else {
			flag = 1;
		}
		if (flag == 0) {
			System.out.println("It is Magic Square");
		} else {
			System.out.println("It is not a Magic Square");
		}

	}

}
