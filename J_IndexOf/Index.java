package J_IndexOf;

public class Index {

	static int index = 0;
	static int[] array = new int[25];

	public static void main(String[] args) {
		getValue(5);
	}

	private static int getValue(int index) {
		if (indexOf(index) == true) {
			// Return index value;
			array[5] = 234;
			System.out.println(array[index]);

			// Скрытие значения элемента массива
//			array[5] = 234;
//			Random ran = new Random();
//			int random = ran.nextInt();
//			System.out.println("if array contain index, set random value!: " + random);
			return array[index];
		} else {
			System.out.println("out of array");
			return index;
		}
	}

	public static boolean indexOf(int ch) {

		if (index >= 0 & index < array.length) {
			return true;
		} else {
			return false;
		}
	}

	// character
	// public int indexOf(int ch ) {
	//
	// }

	// character, fromIndex - чтобы начать поиск.
	// public int indexOf(int ch, int fromIndex) {
	//
	// }

	// String
	// int indexOf(String str) {
	//
	// }

	// String, fromIndex - чтобы начать поиск.
	// int indexOf(String str, int fromIndex) {
	//
	// }
}
