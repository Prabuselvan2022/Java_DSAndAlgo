package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Pg1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		
		int arr1[] = new int[] {5,4,3,2,1};
//		for (int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		for(int num: arr1) {
			System.out.println(num);
		}
		
//		System.out.println("Array.tostring "+ Arrays.toString(arr1));
//		
//		String  str[] =new String[] {"A","B"};
//		
//		System.out.println("Strings are "+ Arrays.toString(str));
		
		String str[] = new String[4];
		for (int i=0; i<str.length; i++ ) {
			str[i]=sc.next();
		}
		
		System.out.println("Strings are "+ Arrays.toString(str));
		
		
	}
}
