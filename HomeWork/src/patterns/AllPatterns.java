package patterns;

public class AllPatterns {

	void mirrorNumberTriangle() {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}
	}
	
	void mirrorOddNumberTriangle() {
		for(int i=1;i<=10;i++) {
			if(i%2 !=0) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}System.out.println();	
			}	
		}
		for(int i=8;i>=1;i--) {
			if(i%2 !=0) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}System.out.println();
			}
		}
	}
	
	void pattern1121FullTriangle() {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}System.out.println();
		}
		}

	void treeNumberPattern() {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5-1;j++) {
				System.out.print(" ");
			}for(int j=1;j<=i;j++) {
				System.out.print(j);
			}for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}System.out.println();
		}
	}
	
	void treeINumberPattern() {

		for(int i=1;i<=7;i++) {
			for(int j=i;j<=7-1;j++) {
				System.out.print(" ");
			}for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}System.out.println();
		}
	}
		
	void tree1_9NumberPattern() {
		for(int i=1;i<=9;i++) {
			for(int j=i;j<=9-1;j++) {
				System.out.print(" ");
			}for(int j=1;j<=i;j++) {
				System.out.print(j);
			}for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}System.out.println();
		}
	}
	
	void tree1_9DownwardNumberPattern() {
		for(int i=9;i>=1;i--) {
			for(int j=i;j<=9-1;j++) {
				System.out.print(" ");
			}for(int j=1;j<=i;j++) {
				System.out.print(j);
			}for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}System.out.println();
		}
	}
	
	void tree9_1NumberPattern() {
		for(int i=9;i>=1;i--) {
			for(int j=1; j<=i*2; j++) {
			System.out.print(" ");
			}
			for(int j=i; j<=9; j++) {
			System.out.print(j+" ");
			}
			for(int j=9-1; j>=i; j--) {
			System.out.print(j+" ");
			}System.out.println();
		}
	}
	
	void trigoTriangle() {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(j);
			}System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j=i;j<=5;j++) {
				System.out.print(j);
			}System.out.println();
		}
	}
	
	void starPattern1() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println(); 
		}
	}
	
	
	void charPatternHypo() {
		
		for(int i=6;i>=1;i--) {
			char ch ='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
		}System.out.println();
	}
		for(int i=1;i<=6;i++) {
			char ch ='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}System.out.println();
		}
	
	
	}
	
	void revCharPattern() {
		
		for(int i=6;i>=1;i--) {
			char ch ='F';
			for(int j=i;j>=1;j--) {
				System.out.print(ch+" ");
				ch--;
		}System.out.println();
	}
	}
	
	void starDiamondPattern() {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void treeCharPattern() {
		
		for(int i=1;i<=7;i++) {
			char ch = 'A';
			for(int j=i;j<=7-1;j++) {
				System.out.print(" ");
			}for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}System.out.println();
		}
	}
	
	void diamondNumberPatternWithStarBorder() {
		
		
		System.out.println("*");
		for(int i=1;i<=5;i++) {
			System.out.print("*");
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}System.out.print("*");
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			System.out.print("*");
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}System.out.print("*");
			System.out.println();
		}
		System.out.print("*");
		
	}
	
	void zeroOnePattern() {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2 ==0)
					System.out.print(0);
				else
					System.out.print(1);
			}System.out.println();
		}
	}
	
	void numberEqualPattern() {
		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(i==j)
					System.out.print(j);
				else
					System.out.print(0);
			}System.out.println();
		}
	}
	
	
}
