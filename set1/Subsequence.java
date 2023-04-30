package set1;

import java.util.Arrays;

public class Subsequence {
	public static void main(String args[]){
	
	String arr[]= {"whisper","format","person","sonnet","shopper","workshop","network","perform"};
	
	int x;
	String substrng1 , substrng2;
	for(int i=0;i<arr.length;i++)
	{
		x=i+1;
		substrng1= arr[i].substring(arr[i].length()-3);
		substrng2= arr[i].substring(arr[i].length()-4);
//		System.out.println(substrng2+" "+substrng1);
		for (int k=i+1;k<arr.length;k++)
		{
			if( arr[k].startsWith(substrng1)||arr[k].startsWith(substrng2))
			{
				String t;
				t=arr[x];
				arr[x]=arr[k];
				arr[k]=t;
				break;
			}
		}
	}
	
	System.out.println(Arrays.toString(arr));
	
	
	
	
	
	
	}

}
