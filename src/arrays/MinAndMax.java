package arrays;

public class MinAndMax {
	
	public static void main(String[] args) {
		
		int arr[] = new int [] {500,20,1,98,300,3};
		
//		int min=Integer.MIN_VALUE;
//		int max= Integer.MAX_VALUE;
		int min=arr[0];
		int max=arr[0];
		for (int i=0 ; i<arr.length; i++ ) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		
		System.out.println("minimum value is "+ min);
		System.out.println("maximum value is "+ max);
		
 	}

}
