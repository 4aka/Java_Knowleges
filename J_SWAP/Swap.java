package J_SWAP;

public class Swap {

	public static void createArray() {
		String data = "1110101000100011101000101110001010001011100010111011101011101000101110111000111011101000101110" +
				"100010111000111010111000101110101110101110001110101110111000111010111000101";
		System.out.print("int[] binary = {");
		for (int i = 0; i < data.length(); i++) {
			System.out.print(data.charAt(i) + ", ");
		}
		System.out.print("};");
	}

	public static int[] binary = { 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0,
			0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0,
			1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0,
			1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0,
			0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, };

	public static int[] array = { 21, 220, 93, 29, 116, 116, 69, 23, 68, 113, 23, 69, 209, 197, 29, 20, 81, 197, 17,
			197, 29, 0 };

	public static int[] clearLetters = new int[array.length];

	// SWAP BYTES
	public static void swap(int[] getBinary) {
		int[] result = new int[getBinary.length];
		int y = getBinary.length;

		for (int i = 0; i < y; i++) {
			result[i] = getBinary[y - i - 1];
			// 0 = 164 - 0
			// 1 = 164 - 1
		}
		System.out.println("\n" + "Result: ");

		for (int i : result) {
			System.out.print(i);
		}
		System.out.println();
	}

	
	public static void cycleGetLetter(int[] intArrayDecimal) {
		for (int i = 0; i < intArrayDecimal.length; i++) {
			if (intArrayDecimal[i] > 26) {
				clearLetters[i] = intArrayDecimal[i] % 26;
			} else {
				clearLetters[i] = intArrayDecimal[i];
			}
			clearLetters[i] = clearLetters[i] + 97;
		}
		System.out.println();
		System.out.print("new array: ");
		System.out.println();
		for (int y = 0; y < intArrayDecimal.length; y++) {
			System.out.print(clearLetters[y] + " ");
		}
		System.out.println();
		// ASCII a = 97, z = 122
		// array[0] = 21 = v(ASCII)
		char[] result = new char[clearLetters.length];
		System.out.println();
		System.out.println("result: ");
		for (int z = 0; z < clearLetters.length; z++) {
			result[z] = (char) clearLetters[z];
			System.out.print(result[z] + " ");
		}
	}

	public static void main(String[] args) {
		createArray();
		System.out.println();
		swap(binary);
		System.out.println();
		cycleGetLetter(array);
	}
}
