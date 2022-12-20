package array;

public class ArrayLiterals {
	
	void arrayLength(int a[]) {
		System.out.println("Length of array is : "+a.length); 
	}
	
	void arrayElements(int a[]) {
		System.out.println("Elements of array are : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	
	void searchElement(int a[],int element) {
		int cnt=0;
		System.out.println();
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				System.out.println("Element is present at index "+i);
			}
			else {
				cnt++;
			}
		}
		if(cnt==a.length) 
			System.out.println("Element not present");
	}
	
	void alternateNumbers(int a[]) {
		System.out.println("Alternate elements of array are : ");
		for(int i=0;i<a.length;i=i+2) {
			System.out.print(a[i]+" ");
		}
	}
	
	void evenNumbers(int a[]) {
		System.out.println("Even Elements in array are : ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayLiterals a = new ArrayLiterals();
		int arr[]= {10,20,39,40,51,64,77,80,94,100};
		
		a.arrayLength(arr);
		a.arrayElements(arr);
		a.searchElement(arr, 60);
		a.alternateNumbers(arr);
		a.evenNumbers(arr);
	}
}