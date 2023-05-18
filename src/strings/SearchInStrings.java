package strings;

public class SearchInStrings {

	public static void main(String[] args) {

		String str = "Prabu";
		char target = 'm';

		System.out.println(search(str, target));

	}

	static boolean search(String str, int target) {

		if (str.length() == 0)
			return false;

//		for (int i = 0; i < str.length(); i++) {
//			char charAt = str.charAt(i);
//			if (charAt == target) {
//				return true;
//			}
//		}

		char ch[] = str.toCharArray();

		for (char c : ch) {
			if (c == target) {
				return true;
			}
		}
		return false;
	}
}
