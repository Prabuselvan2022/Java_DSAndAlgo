package arrays;

import java.util.HashSet;
import java.util.Set;

public class PairSum {

    public static void main( String[] args ) {

        int arr[] = new int[]{12, 3, 5, 1, 9, 7};
        int target = 11;
        boolean sumPair = sumPair(arr, target);
        System.out.println("sumPair is " + sumPair);

//		Soln1
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				int temp = arr[i] + arr[j];
//				if (temp == target) {
//					System.out.println(arr[i]);
//					System.out.println(arr[j]);
//				}
//			}
//		}

//		Soln2
//		Arrays.sort(arr);
//		{1,3,5,7,9,12}

//		int start = 0;
//		int end = arr.length - 1;
////
//		while (start < end) {
//			int temp = arr[start] + arr[end];
//			if (temp == target) {
//
//				System.out.println(arr[start]);
//				System.out.println(arr[end]);
//				start++;
//				end--;
//			} else if (temp > target) {
//				end--;
//			} else {
//				start++;
//			}
//		}

    }
//	{1,3,5,7,9,12}

    public static boolean sumPair( int arr[], int target ) {

//		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        Set<Integer> shset = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {

            int temp = target - arr[i];
            if (shset.contains(temp)) {

                return true;
            } else {
                shset.add(arr[i]);
            }
        }
        return false;

    }
}
