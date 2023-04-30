package set1;

import java.util.Arrays;

public class TrialAndError {

	public static void main(String[] args) {
		
		String arr[]= {"whisper","format","perform","sonnet","person","shopper","workshop","network"};
		
		String first[] = new String [arr.length];
		String last[] = new String [arr.length];
		String last4[] = new String [arr.length];
		
		
		String finall[] = new String[arr.length];
		
	//Putting the first 3 words in array 
		for(int i=0;i<arr.length;i++) {
			first[i]=arr[i].substring(0, 3);
		}
		
		System.out.println(Arrays.toString(first));
		
		for(int j=0;j<arr.length;j++) {
			last[j]=arr[j].substring(arr[j].length()-3,arr[j].length());
			
		}
		System.out.println(Arrays.toString(last));
		
		for(int k=0;k<arr.length;k++) {
			last4[k]=arr[k].substring(arr[k].length()-4,arr[k].length());
			
		}
		System.out.println(Arrays.toString(last4));
		
		
		finall[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			for(int j=0;j<last.length;j++)
			if(arr[i].startsWith(last[j]) || arr[i].startsWith(last4[j])) {
				finall[i]=arr[i];
				System.out.println(finall[i]);
				break;
			}
		}
	//	System.out.println(Arrays.toString(finall));
		
	}
	
}
