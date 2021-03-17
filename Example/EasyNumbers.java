package Example;

public class EasyNumbers {

	public static void main(String[] args) {
		execute2();
	}

	// public static void execute() {
	//
	// int n = 100;
	// int[] full = new int[n];
	//
	// for (int i = 0; i < n; i++) {
	// full[i] = i;
	// }
	// full[1] = 0;
	//
	// for (int j = 2; j < n; j++) {
	// if (full[j] != 0) {
	// for (int k = j * 2; k < n; k += j) {
	// full[k] = 0;
	// }
	// }
	// }
	//
	// for (int i = 0; i < n; i++) {
	// if (full[i] != 0) {
	// System.out.printf("%4d", full[i]);
	// }
	// }
	// System.out.println();
	// }

	// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
	// 73, 79, 83, 89, 97

	public static void execute2() {

		for (int i = 2; i < 100; i++) {

			for (int k = 2; k < 100; k++) {

				if (i % k == 0) {
					System.out.println(i);
				}
			}
		}
	}
}