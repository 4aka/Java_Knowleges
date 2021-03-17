package J_BitOperation;

public class LocalClassShowBits {

	public static void main(String[] args) {

		// Inner class in MAIN method!!!
		// Этот класс не доступен за пределами main
		class ShowBits {
			int numBits;

			ShowBits(int n) {
				numBits = n;
			}

			void show(long val) {
				long mask = 1;

				mask <<= numBits - 1;
				int spacer = 0;
				for (; mask != 0; mask >>>= 1) {
					if ((val & mask) != 0) System.out.print("1");
					else System.out.print("0");
					spacer++;
					if ((spacer % 8) == 0) {
						System.out.print(" ");
						spacer = 0;
					}
				}
				System.out.println();
			}
		}
		
		for(byte b = 0; b < 10; b++) {
			ShowBits byteVal = new ShowBits(8);
			
			System.out.println(b + "in binary: ");
			byteVal.show(b);
		}
	}
}
