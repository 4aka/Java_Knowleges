package Example;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		baseResult();
		System.out.println();

		Scanner reader = new Scanner(System.in);
		System.out.println("Set first boolean variable:");
		boolean resultA = reader.nextBoolean();
		System.out.println("Set second boolean variable:");
		boolean resultB = reader.nextBoolean();
		reader.close();

		myResult(resultA, resultB);
	}

	public static void myResult(boolean p, boolean q) {

		int t;

		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		if (p == true) {
			t = 1;
			System.out.print(t + "\t");
		} else {
			t = 0;
			System.out.print(t + "\t");
		}

		if (q == true) {
			t = 1;
			System.out.print(t + "\t");
		} else {
			t = 0;
			System.out.print(t + "\t");
		}

		boolean result;
		result = p & q;
		if (result == true) {
			t = 1;
			System.out.print(t + "\t");
		} else {
			t = 0;
			System.out.print(t + "\t");
		}
		result = p | q;
		if (result == true) {
			t = 1;
			System.out.print(t + "\t");
		} else {
			t = 0;
			System.out.print(t + "\t");
		}
		result = p ^ q;
		if (result == true) {
			t = 1;
			System.out.print(t + "\t");
		} else {
			t = 0;
			System.out.print(t + "\t");
		}
		result = !p;
		if (result == true) {
			t = 1;
			System.out.print(t + "\t");
		} else {
			t = 0;
			System.out.print(t + "\t");
			System.out.println();
		}
	}

	public static void baseResult() {

		boolean p, q;

		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		p = true;
		q = true;

		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = true;
		q = false;

		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = false;
		q = true;

		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = false;
		q = false;

		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));
	}
}