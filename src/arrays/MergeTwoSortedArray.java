package arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main( String[] args ) {
        System.out.println("Welcome");

        int nums1[] = new int[]{1, 2, 3, 0, 0, 0};
        int nums2[] = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge( int[] nums1, int m, int[] nums2, int n ) {

//        int first=m-1;
//        int second=n-1;
//
//        for (int i=nums1.length-1; i>=0; i--) {
//            if (second < 0) return;
//
//            if (first>=0 && nums1[first] > nums2[second]) {
//                nums1[i] = nums1[first];
//                first--;
//            } else {
//                nums1[i] = nums2[second];
//                second--;
//            }
//        }


        int first = m - 1;
        int second = n - 1;
        int i = nums1.length - 1;
        while (i >= 0) {
            if (second < 0) return;
            if (first >= 0 && nums1[first] > nums2[second]) {
                nums1[i] = nums1[first];

                first--;
                i--;
            } else {
                nums1[i] = nums2[second];
                second--;
                i--;
            }
        }


    }
}
