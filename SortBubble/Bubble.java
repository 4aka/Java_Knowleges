package SortBubble;

public class Bubble {

	public static void main(String[] args) {
		int[] nums = { 23, 3, 232, 123434, 45543, 32, 32, 4534, 4523, 869 };
		int a, b, t;
		int size = 10;

		// Display default array.
		System.out.println("Default array: ");
		for (int i = 0; i < size; i++) {
			System.out.println(nums[i]);
		}
		System.out.println();

		// Display array after bubble sort.
		for (a = 1; a < size; a++) {
			for (b = size - 1; b >= a; b--) {
				// Change element place if it need.
				if (nums[b - 1] > nums[b]) {
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;
				}
			}
		}
		
		// Display sort array.
		System.out.println("Sort array: ");
		for (int i = 0; i < size; i++) {
			System.out.println(nums[i]);
		}
	}
}
