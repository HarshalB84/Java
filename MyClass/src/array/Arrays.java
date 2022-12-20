package array;


public class Arrays {
	
	
	
	
		void addElements(int a[]) {
			
		int add=0;
			
		for(int i=0;i<a.length;i++) {
			add = add+a[i];
		}
		System.out.println("Addition of arrays is : "+add);
		
	}
		
		void primeElements(int a[]) {
			
			for(int i=0;i<a.length;i++) {
				int j;
				int mid = a[i]/2;
				for(j=2;j<=mid;j++) {
					if(a[i]%j==0) {
						break;
					}				
				}
				if(j>mid) {
					
					System.out.print(a[i]+" ");
			}
			
		}
	}
		
		void reverseNumber(int a[]) {
			
			for(int i=a.length-1;i>=0;i--) {
				System.out.print("Reverse elements are "+a[i]+" ");
			}
		}
		
		void negativeNumber(int a[]) {
			int i;
			for(i=0;i<a.length;i++) {
				if(a[i]<0) {
					a[i]=0;
				}
				System.out.print(a[i]+" ");
			}
		}
		
		void average(int a[]) {
			int average = 0,total=0;
			for(int i=0;i<a.length;i++) {
				total=total+a[i];
				average=total/a.length;
				
			}
			System.out.println("Average is : "+average);
			
		}
		
}
