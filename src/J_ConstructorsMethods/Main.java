package J_ConstructorsMethods;

public class Main {

	public static void main(String[] args) {
		int count;

		// Create object FDemo's class.
		FDemo ob = new FDemo(0);

		for (count = 1; count < 100000; count++) {
			// address to method generator
			// & set int count
			ob.generator(count);
		}
	}
}
