package strings;

public class TwoDArrays {
	public static void main(String[] args) {

		int arr[][] = new int[][] { { 23, 4, 1 }, { 18, 12, 3, 9 }, { 78, 99, 34, 56 }, { 18, 12 } };

		int target = 99;
		boolean searchop = search(arr, target);

		System.out.println("output is " + searchop);

	}

	static boolean search(int arr[][], int target) {

		System.out.println("Array length is " + arr.length);
		if (arr.length == 0)
			return false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
				if (arr[i][j] == target) {
//					System.out.println(arr[i][j]);
					return true;
				}

			}
		}
		return false;
	}

}
