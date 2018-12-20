package the3profe.jse8.algorithms;


public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		int[] list = new int[2];

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					list[0] = i;
					list[1] = j;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {

		int[] list = { 1, 3, 4, 5 };
		int n = 7;
		int[] newlist = twoSum(list, n);
		System.out.print("[");
		for (int i : newlist) {
			System.out.print(i + "    ");
		}
		System.out.print("]");
	}

}
