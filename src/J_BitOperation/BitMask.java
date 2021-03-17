package J_BitOperation;

public class BitMask {

	public static void main(String[] args) {
		// Битовая маска используется, например, для смены значения одного бита в байте.
		boolean resultCheck = checkBit(3, (byte) 0b00101101);
		System.out.println("Checked Bit " + resultCheck);
		byte resultChange = changeBit(3, (byte) 0b00101101);
		System.out.println("Changed bit: " + displayBits(resultChange));
	}

	// Сброс указанного бита.
	public static byte changeBit(int bitNum, byte byteForChanging) {
		// 00000000 => 00100000.
		byte defaultMask = (byte) (0b00000001 << bitNum);
		// 00100000 => 11011111.
		byte finishMask = (byte) (~defaultMask);
		// 00101101 => 00001101 5bit = 0.
		return (byte) (byteForChanging & finishMask);
	}

	// Сброс указанного бита.
	public static byte setBit(int bitNum, byte val) {
		return (byte) (val & (~(1 << bitNum)));
		// 1 = 0b00000001.
	}

	// Проверка установленности бита.
	public static boolean checkBit(int bitNum, byte gettingByte) {
		boolean result = false;
		byte defaultMask = 0;
		if (bitNum <= 8) {
			if (((byte) (gettingByte & defaultMask)) == (byte) (0b00000001 << bitNum)) {
				System.out.println("bit № " + bitNum + " установлен.");
				result = true;
			} else {
				System.out.println("bit № " + bitNum + " НЕ установлен.");
				result = false;
			}
		} else {
			System.out.println("Error: bit number can not be greater than 8");
		}
		return result;
	}

	// Проверка установленности бита.
	public static boolean bitIsSet(int bitNum, byte val) {
		return ((1 << bitNum) & val) != 0;
	}

	// Отображение байта.
	public static String displayBits(byte setVal) {
		String s2 = String.format("%8s", Integer.toBinaryString(setVal & 0xFF)).replace(' ', '0');
		return s2;
	}
}
