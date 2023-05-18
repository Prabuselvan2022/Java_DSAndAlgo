package arrays;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		
		int arr[] = new int[] {7,6,5,4,3,2,1};
		
//		reverse
//		 for(int i=arr.length-1; i>=0; i-- ) {
//			 System.out.println(arr[i]);
//		 }
		
		
//		approach 1
//		int i=0;
//		int end=arr.length-1;
//		while (i<end) {
//			int temp =arr[i];
//			arr[i]=arr[end];
//			arr[end] =temp;
//			i++;
//			end--;
//		}
			
		
//		System.out.println(Arrays.toString(arr));
		
//		approach 2
		
		for (int i=0; i<=(arr.length-1)/2; i++ ) {
			swap(arr, i, arr.length-i-1);
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int arr[], int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	
}
