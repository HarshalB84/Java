package day2;

public class BinarySearchUsingLoop {
	
	int binarySearch(int searchelement, int c[]) {
		int indexofelement = -1;
		
		boolean check=false;
		
		for(int i=0;i<c.length;i++) {
			if(c[i]==searchelement) {
				check=true;
				break;
			}
		}
		if(check==true) {
		int left=0, right=c.length, mid=0;   
		while(left < right) {  
			mid = (left+right)/2;
			if(searchelement > c[mid]) {  
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		indexofelement = left;
	}
		return indexofelement;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {112, 120, 134, 156, 167, 168, 173, 176, 178, 189};
	
		System.out.println(new BinarySearchUsingLoop().binarySearch(180, arr));
	}

	
}
