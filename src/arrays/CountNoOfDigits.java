package arrays;

public class CountNoOfDigits {

    public static void main( String[] args ) {

        int arr[] = new int[]{555, 901, 482, 1771, 5555, 666666, 1};

        int findNumbers = findNumbers(arr);

        System.out.println("findNumbers " + findNumbers);
    }

//	Solution 1
//	static int findNumbers(int arr[]) {
//		String str[] = new String[arr.length];
//		int cnt = 0;
//		for (int i = 0; i < arr.length; i++) {
//			String valueOf = String.valueOf(arr[i]);
//			System.out.println("valueOf is " + valueOf.length());
//			if (valueOf.length() % 2 == 0) {
//				++cnt;
//			}
//
//		}
//		return cnt;
//	}

//	Solution 2

    static int findNumbers( int arr[] ) {
        int cnt = 0;
        for (int num : arr) {
            if (even(num)) {
                cnt++;
            }
        }
        return cnt;
    }

    static boolean even( int num ) {
        int findNoOfDigits = findNoOfDigits(num);
        return findNoOfDigits % 2 == 0;
    }

    static int findNoOfDigits( int num ) {
        int cnt = 0;

        while (num > 0) {
            cnt++;
            num = num / 10;
        }
        return cnt;
    }


}
