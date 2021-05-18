package J_TryCatch;

public class Try {

	public static void main(String[] args) {

		int num1, num2;

		try {
			num1 = 0;
			num2 = 62 / num1;
			System.out.println(num2);
			System.out.println("Hey I'm at the end of try block");
		} catch (ArithmeticException e) {
			System.out.println("You should not divide a number by zero");
		} catch (Exception e) {
			System.out.println("Exception occurred");
		}
		System.out.println("I'm out of try-catch block in Java.");
	}

	public static void example() {

		try {
			int a[] = new int[7];
			a[4] = 30 / 0;
			System.out.println("First print statement in try block");
		} catch (ArithmeticException e) {
			System.out.println("Warning: ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Warning: Some Other exception");
		}
		System.out.println("Out of try-catch block...");
	}
}