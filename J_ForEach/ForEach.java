package J_ForEach;

public class ForEach {

	public static void main(String[] args) {

		// int.
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		for (int x : nums) {
			System.out.println("Value: " + x);
			sum += x;
		}

		System.out.println("Sum: " + sum);

		// String.
		String[] st = { "asd", "d", "qwe", "dsf", "d", "df" };
		String result = "";

		for (String y : st) {
			System.out.println("Value: " + y);
			result += y;
		}

		System.out.println("Sum: " + result);

		// break.
		for (int x : nums) {
			System.out.println("Value: " + x);
			sum += x;

			if (x == 5) {
				break; // Прерывание.
			}
		}
		System.out.println("Sum: " + sum);
	}
}
