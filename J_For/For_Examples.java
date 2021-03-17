package J_For;

import java.io.IOException;

public class For_Examples {

	public static void exmaple() throws IOException {

		// Examples 1
		for (int i = 0; i < 100; i++) {

			// TODO
		}

		// Examples 2
		int i;
		for (i = 0; (char) System.in.read() != 'S'; i++) {

			// TODO
			// Cycle will be repeat till enter 'S'
			// Where can i use this example?
		}

		// Examples 3
		for (int j = 0; j < 100; j++) {

			for (int k = 0; k < j; k++) {
				// TODO
			}
		}

		// Examples 4
		for (int l = 0; l < 10;) {
			l++; // Incremention in body cycle
			// TODO
		}

		// Examples 5
		int r = 0; // i can calculate value before cycle start
		for (; r < 10;) {
			r++; // Incremention in body cycle or decremention, or smth else
			// TODO
		}

		// Examples 6
		for (;;) {
			// This cycle is endless
			// i can use some condition, than use break for finish.
			// TODO
		}
	}
}
