package arrays;

public class RichCustomer {

	public static void main(String[] args) {

		int arr[][] = new int[][] { { 1, 5 }, { 7, 3 }, { 3, 5 } };
		int maxWealth = maxWealth(arr);
		System.out.println("maxWealth is " + maxWealth);
	}

	static int maxWealth(int accounts[][]) {

		int val = 0;

		for (int i = 0; i < accounts.length; i++) {

			int temp = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				System.out.println(accounts[i][j]);
				temp = temp + accounts[i][j];
			}
			if (temp > val) {
				val = temp;
			}
		}
		return val;
	}
}
