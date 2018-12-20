package the3profe.jse8.algorithms;

public class IsPalindrome {

	public static boolean isPalindrome(int x) {

		boolean var = false;

		String str = String.valueOf(x);
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
				var = true;
			}
		}
		return var;

	}

	public static void main(String[] args) {

		int x = 1234321;
		System.out.println(isPalindrome(x));
	}
}
