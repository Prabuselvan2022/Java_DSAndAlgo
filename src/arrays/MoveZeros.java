package arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void main( String[] args ) {
        int nums[] = new int[]{0, 1, 0, 0, 0, 3, 12, 3, 0, 0, 5, 6, 8};
        zerosAtEnd(nums);
    }

    static void zerosAtEnd( int nums[] ) {
        int cnt = 0;
        int key = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cnt++;
            } else {
                nums[key] = nums[i];
                key++;
            }
        }

        for (int j = nums.length - cnt; j < nums.length; j++) {
            nums[j] = 0;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("cnt is " + cnt);
    }
}

