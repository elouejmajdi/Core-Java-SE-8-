package the3profe.jse8.algorithms;


public class ReverseInt {

	public static int reverse(int x) {

		String str = String.valueOf(x);
		String str1 = "";
		for (int i = str.length() - 1; i > 0; i--) {
			str1 += str.charAt(i);

		}

		return (Integer.parseInt(str1));

	}

	public static void main(String[] args) {

		int x = 987654;
		int y = reverse(x);

		System.out.println("x is" + x + " and the reverse of x is " + y);

	}

}
