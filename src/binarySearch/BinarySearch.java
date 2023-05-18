package binarySearch;

public class BinarySearch {
	public static void main(String[] args) {

//		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		int arr[] = new int[] { -18,-12,-4,0,2,3,4,15,16,18,22,45,89 };
		int target = 45;
		int binary = binary(arr, target);
		System.out.println("element is "+binary );
	}

	static int binary(int arr[], int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
//			System.out.println("mid is "+ mid);
			System.out.println("mid element is "+ arr[mid]);
			if (arr[mid]==target) {
				return mid;
			} else if (arr[mid]>target) {
				 end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;

	}

}
